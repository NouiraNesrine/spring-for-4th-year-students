package org.intellij.myspring.profile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {
    public static void main(String[] args){
        AnnotationConfigApplicationContext ct = new AnnotationConfigApplicationContext();
//        ct.getEnvironment().setActiveProfiles("test");
        ct.getEnvironment().setDefaultProfiles("dev");
        ct.scan("org.intellij.myspring.profile");
        ct.refresh();
        ct.getBean(DatabaseHandler.class).printDb();
    }
}
