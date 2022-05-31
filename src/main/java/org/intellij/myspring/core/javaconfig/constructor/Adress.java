package org.intellij.myspring.core.javaconfig.constructor;

public class Adress {

    private String street;
    private String City;
    private Person person;

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

    public Person getPerson() {
        return person;
    }


}
