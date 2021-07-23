/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Pooja
 */
public class House {
    private Set<Person> persons = new HashSet<>();
    private String streetAddress;

    public House(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void addPersons(final Person person) {
        persons.add(person);
    }
    public Set<Person> getPersons() {
        return persons;
    }

    public String getStreetAddress() {
        return streetAddress;
    }
}
