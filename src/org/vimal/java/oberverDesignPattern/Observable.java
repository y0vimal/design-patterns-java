package org.vimal.java.oberverDesignPattern;

public interface Observable {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifyObservers();
}