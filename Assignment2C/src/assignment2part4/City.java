/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2part4;

import java.util.HashSet;
import java.util.Set;

public class City {
    private String cityName;
    private Set<Community> communities = new HashSet<>();

    public Set<Community> getCommunities() {
        return communities;
    }

    public void addCommunity(final Community community) {
        communities.add(community);
    }

    public String getCityName() {
        return cityName;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }

    
}
