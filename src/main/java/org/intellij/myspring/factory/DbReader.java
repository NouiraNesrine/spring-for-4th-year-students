package org.intellij.myspring.factory;

public class DbReader implements Reader{
    @Override
    public void read() {
        System.out.println("DbReader reader");
    }
}
