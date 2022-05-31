package org.intellij.myspring.aspects;
/**
 * Calculator interface
 * */
public interface ICalculator {

    /**
     * Adds 2 numbers
     * @param  x
     * @param y
     * @return
     * */
    double addition(double x,double y);
    /**
     * substruct 2 numbers
     * @param  x
     * @param y
     * @return
     * */
    double substruction(double x,double y);
    /**
     * multiply 2 numbers
     * @param  x
     * @param y
     * @return
     * */
    double multiplication(double x,double y);
    /**
     * divide 2 numbers
     * @param  x
     * @param y
     * @return
     * */
    double division(double x,double y);
}
