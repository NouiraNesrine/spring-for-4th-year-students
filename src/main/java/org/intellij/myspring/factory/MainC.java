package org.intellij.myspring.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainC {

    public static void main(String[] args){

        ApplicationContext c = new AnnotationConfigApplicationContext(ReaderConfiguration.class);
        c.getBean("fileReader",Reader.class).read();
        c.getBean("webReader",Reader.class).read();
        c.getBean("dbReader",Reader.class).read();
    }
}
