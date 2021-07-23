/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part4;

/**
 *
 * @author Pooja
 */
import java.util.Objects;

public class Person {

    protected final String firstName;
    protected final String lastName;
    protected final String city;
    protected final String community;
    protected final String streetAddress;

    public Person(String firstName, String lastName, String city, String community, String streetAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.community = community;
        this.streetAddress = streetAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) { return true; }
        if (o == null || getClass() != o.getClass()) { return false; }
        Person person = (Person) o;
        return firstName.equals(person.firstName) && lastName.equals(person.lastName) && city.equals(person.city) && community
                .equals(person.community) && streetAddress.equals(person.streetAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, city, community, streetAddress);
    }

    @Override
    public String toString() {
        return "Person{" + "firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", city='" + city + '\'' + ", community='"
                + community + '\'' + ", streetAddress='" + streetAddress + '\'' + '}';
    }
}

