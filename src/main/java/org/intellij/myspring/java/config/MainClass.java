package org.intellij.myspring.java.config;

import org.intellij.myspring.core.javaconfig.ArtistConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Primary;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args){

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);

        Department d1 = context.getBean(Department.class);
        d1.addPerson(context.getBean(Person.class));
        System.out.println(d1.toString());

        Department d2 =  context.getBean(Department.class);
        Person p = new Person(1,"ddd","eee",null);
        d2.addPerson(p);
        System.out.println(d2.toString());


    }
}
