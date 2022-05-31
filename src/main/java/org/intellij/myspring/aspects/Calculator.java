package org.intellij.myspring.aspects;

import org.springframework.stereotype.Component;

@Component
public class Calculator implements ICalculator{
    @Override
    public double addition(double x, double y) {
        System.out.println("processing");
        return x+y;
    }

    @Override
    public double substruction(double x, double y) {
        System.out.println("processing");
        return x-y;
    }

    @Override
    public double multiplication(double x, double y) {
        double res = x*y;
        System.out.println("processing"+res);
        return res;
    }

    @Override
    public double division(double x, double y) {
        System.out.println("processing");
        if(y==0){
            throw new IllegalArgumentException("cant divide by 0");
        }
        return x/y;
    }
}
