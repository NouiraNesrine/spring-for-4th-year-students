package org.intellij.myspring.java.config;

public class Adress {

    private String street;
    private String City;


    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", City='" + City + '\'' +
                '}';
    }

    public Adress(String street, String city) {
        this.street = street;
        City = city;

    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }



}
