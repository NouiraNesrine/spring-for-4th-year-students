package org.intellij.myspring.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args){
        ApplicationContext ct = new AnnotationConfigApplicationContext(FileConfiguration.class);
        ct.getBean(FileContext.class).readFile();
        ((ConfigurableApplicationContext)ct).close();
    }


}
