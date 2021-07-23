/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part4;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;


public class System {
    private final Set<Person> persons = new HashSet<>();
    private final Set<Patient> patients = new HashSet<>();

    private final Set<City> cities = new HashSet<>();

    public System addPatient(final Patient patient) {
        if (persons.contains(patient)) {
            persons.remove(patient);
        }
        patients.add(patient);
        addToHouse(patient);
        return this;
    }

    public System addPerson(final Person person) {
        if (patients.contains(person)) {
            throw new RuntimeException("cannot add person as its already a patient.");
        }
        persons.add(person);
//        add(person);
        return this;
    }

    public Set<Patient> getAbonormals(final String cityName, final String communityName, final String vitalName) {
        for(City city: cities) {
            if (city.getCityName().equals(cityName)) {
                final Set<Community> communities = city.getCommunities();
                for (Community community: communities) {
                    if (community.getCommunityName().equals(communityName)) {
                        return community.getHouses().stream()
                                .flatMap(house -> house.getPersons().stream())
                                .filter(e -> e instanceof Patient)
                                .map(Patient.class::cast)
                                .filter(e -> !e.isThisVitalSignNormal(vitalName))
                                .collect(Collectors.toSet());
                    }
                }
            }
        }
        return null;
    }

    public Map<String, Integer> getAbonormalsForAllCommunities(final String vitalName) {
        final Map<String, Integer> communityAbnormalMap = new HashMap<>();

         cities.stream()
                .flatMap(city -> city.getCommunities().stream())
                .flatMap(community -> community.getHouses().stream())
                .flatMap(house -> house.getPersons().stream())
                .filter(e -> e instanceof Patient)
                .map(Patient.class::cast)
                .filter(e -> !e.isThisVitalSignNormal(vitalName))
                .forEach(person -> {
                    final Integer count = communityAbnormalMap.get(person.community);
                    if(Objects.nonNull(count)) {
                        communityAbnormalMap.put(person.community, count.intValue() +1 );
                    } else {
                        communityAbnormalMap.put(person.community, 1 );
                    }
                });
         return communityAbnormalMap;
    }

    private void addToHouse(Person person) {
        final Optional<City> cityOpt = cities.stream()
                .filter(ci -> ci.getCityName().equals(person.city)).findAny();

        if (!cityOpt.isPresent()) {
            final City cityObj = new City(person.city);
            final Community communityObj = new Community(person.community);
            final House house1 = new House(person.streetAddress);
            cityObj.addCommunity(communityObj);
            communityObj.addHouse(house1);
            house1.addPersons(person);
            cities.add(cityObj);
        } else {
            final Optional<Community> communityOpt = cityOpt
                    .flatMap(e -> e.getCommunities().stream()
                            .filter(co -> co.getCommunityName().equals(person.community)).findAny());
            if (!communityOpt.isPresent()) {
                final City cityObj = cityOpt.get();
                final Community communityObj = new Community(person.community);
                final House house1 = new House(person.streetAddress);
                cityObj.addCommunity(communityObj);
                communityObj.addHouse(house1);
                house1.addPersons(person);
            } else {
                final Optional<House> houseOpt = communityOpt
                        .flatMap(e -> e.getHouses().stream()
                                .filter(ho -> ho.getStreetAddress().equals(person.streetAddress)).findAny());

                if (!houseOpt.isPresent()) {
                    final City cityObj = cityOpt.get();
                    final Community communityObj = communityOpt.get();
                    final House house1 = new House(person.streetAddress);
                    cityObj.addCommunity(communityObj);
                    communityObj.addHouse(house1);
                    house1.addPersons(person);
                } else {
                    houseOpt.get().addPersons(person);
                }
            }
        }
    }
    
}
