package org.vimal.java.abstractfactorypattern;

public class JsonReader implements Reader{

    @Override
    public void read() {
        System.out.println("json reader");
    }
}
