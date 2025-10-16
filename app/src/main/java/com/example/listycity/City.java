package com.example.listycity;

import java.util.Objects;

/**
 * This is a class that defines a City.
 */
public class City implements Comparable<City> {
    private String city;
    private String province;
    City(String city, String province){
        this.city = city;
        this.province = province;
    }
    String getCityName(){
        return this.city;
    }
    String getProvinceName(){
        return this.province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public int compareTo(City o) {
        // City city = (City) o;
        return this.city.compareTo(o.city);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return Objects.equals(city, city1.city) && Objects.equals(province,city1.province);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, province);
    }

}

