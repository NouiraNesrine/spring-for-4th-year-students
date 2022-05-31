package org.intellij.myspring.factory;

public class FileReader implements Reader{

    @Override
    public void read() {
        System.out.println("file reader reading");
    }
}
