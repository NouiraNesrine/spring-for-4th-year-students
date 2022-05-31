package org.intellij.myspring.core.javaconfig.constructor;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person extends Details{
    private int id;
    private String name;
    private String lastName;
    private Adress adress;

    private List<String> stringList;
    private Set<String> stringSet;
    private Map<String,String> stringMap;

    private List<Adress> adresdes;

    private Properties properties;

    private Properties details;

    @Override
    public Properties getDetails() {
        return details;
    }

    @Override
    public void setDetails(Properties details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", adress=" + adress +
                ", stringList=" + stringList +
                ", stringSet=" + stringSet +
                ", stringMap=" + stringMap +
                ", adresdes=" + adresdes +
                ", properties=" + properties +
                ", details=" + details +
                '}';
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public List<Adress> getAdresdes() {
        return adresdes;
    }

    public void setAdresdes(List<Adress> adresdes) {
        this.adresdes = adresdes;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public Set<String> getStringSet() {
        return stringSet;
    }

    public void setStringSet(Set<String> stringSet) {
        this.stringSet = stringSet;
    }

    public Map<String, String> getStringMap() {
        return stringMap;
    }

    public void setStringMap(Map<String, String> stringMap) {
        this.stringMap = stringMap;
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

    public Person(int id, String name, String lastName, Adress adress) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        if(adress!=null){
            this.adress = adress;
        }

    }
}
