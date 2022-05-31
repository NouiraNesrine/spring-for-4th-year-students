package org.intellij.myspring.aspects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MasterClass {
    public static void main(String[] args){
        ApplicationContext ct = new AnnotationConfigApplicationContext(CalculatorConfiguration.class);

       ct.getBean("calculator",ICalculator.class).multiplication(2,8);

    }
}
