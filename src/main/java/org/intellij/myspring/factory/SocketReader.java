package org.intellij.myspring.factory;

public class SocketReader implements Reader{
    @Override
    public void read() {
        System.out.println("WebSocket reader");
    }
}
