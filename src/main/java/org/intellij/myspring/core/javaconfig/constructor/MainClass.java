package org.intellij.myspring.core.javaconfig.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainClass {

    public static void main(String[] args){
//        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContextForConstructor.xml","ApplicationContext.xml");
        ApplicationContext context = new FileSystemXmlApplicationContext("D:\\workspace\\intellij\\spring-task\\src\\main\\resources\\ApplicationContextForConstructor.xml","D:\\workspace\\intellij\\spring-task\\src\\main\\resources\\ApplicationContext.xml");
        System.out.println(context.getBean("person"));
    }
}
