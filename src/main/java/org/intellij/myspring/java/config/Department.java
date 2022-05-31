package org.intellij.myspring.java.config;

import jdk.nashorn.internal.objects.annotations.ScriptClass;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
@Scope("prototype")
public class Department {
    private List<Person> list = new ArrayList<>();
    public void addPerson(Person p){
        list.add(p);
    }

    public List<Person> getList(){
        return list;
    }

    @Override
    public String toString() {
        return "Department{" +
                "list=" + list +
                '}';
    }
}
