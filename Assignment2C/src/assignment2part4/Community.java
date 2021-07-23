/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part4;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author win 10
 */
public class Community {

    private String CommunityName;
    private Set<House> houses = new HashSet<>();

    public Community(String communityName) {
        CommunityName = communityName;
    }

    public Set<House> getHouses() {
        return houses;
    }

    public String getCommunityName() {
        return CommunityName;
    }

    public void addHouse(final House house) {
        houses.add(house);
    }

    
}
