package org.intellij.myspring.core.javaconfig;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

    public static void main(String[] args){

        //ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfig.class);
//        BeanFactory applicationContext = new AnnotationConfigApplicationContext(ArtistConfig.class);
//        System.out.println(applicationContext.getBean("Splash"));
        ApplicationContext Context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        System.out.println(Context.getBean("artist"));
    }
}
