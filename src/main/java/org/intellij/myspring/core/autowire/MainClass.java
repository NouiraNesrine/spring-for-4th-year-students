package org.intellij.myspring.core.autowire;

import org.intellij.myspring.core.Product;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextAutowire.xml");
        Person p = context.getBean("person",Person.class);
        System.out.println(p.toString());
    }
}
