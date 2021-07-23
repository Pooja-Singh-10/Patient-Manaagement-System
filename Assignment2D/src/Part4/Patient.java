/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Pooja
 */
public class Patient extends Person {
    private List<Encounter> encounters = new ArrayList<>();

    private int latestEncounterIdex = -1;


    public Patient(String firstName, String lastName) {
        super(firstName, lastName, "", "", "");
    }

    public Patient(String firstName, String lastName, String city, String community, String streetAddress) {
        super(firstName, lastName, city, community, streetAddress);
    }

    public boolean isPatientNormal() {
        return getCurrentVitalSigns().isNormal();
    }

    public boolean isThisVitalSignNormal(final String vitalSignName) {
        return getCurrentVitalSigns().isNormal(vitalSignName);
    }

    public Patient addVitalSigns(final Part4.VitalSigns vitalSigns) {
        encounters.add(new Encounter(vitalSigns));
        latestEncounterIdex++;
        return this;
    }

    public void printVitalSigns() {
        java.lang.System.out.println(String.format("PatientName: %s %s", firstName, lastName));
        for (int i = 0 ; i < encounters.size(); i++) {
            java.lang.System.out.println("  " + (i + 1) + "_" + encounters.get(i).toString());
        }
    }

    private VitalSigns getCurrentVitalSigns() {
        return encounters.get(latestEncounterIdex).getVitalSigns();
    }

    @Override
    public String toString() {
        return "Patient{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", city='" + city + '\'' + ", community='"
                + community + '\'' + ", streetAddress='" + streetAddress + '\'' + '}';
    }

}

