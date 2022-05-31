package org.intellij.myspring.core.autowire;

import org.intellij.myspring.core.javaconfig.constructor.Details;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person extends Details {
    private int id;
    private String name;
    private String lastName;
    private Adress adress;

    private List<Adress> adresdes;

    public Person(int id, String name, String lastName, Adress adress) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.adress = adress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Adress getAdress() {
        return adress;
    }

    public void setAdress(Adress adress) {
        this.adress = adress;
    }

    public List<Adress> getAdresdes() {
        return adresdes;
    }

    public void setAdresdes(List<Adress> adresdes) {
        this.adresdes = adresdes;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress=" + adress +
                ", adresdes=" + adresdes +
                '}';
    }


}
