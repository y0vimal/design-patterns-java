package org.vimal.java.oberverDesignPattern;

import org.vimal.java.oberverDesignPattern.model.SensorData;

import java.util.ArrayList;
import java.util.List;

public class SensorReceiver implements Observable {

    private List<Observer> observers = new ArrayList<>();
    private SensorData data ;

    public void changeData(SensorData data){
        this.data = data;
        notifyObservers();
    }


    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {

            observers.forEach(observer -> observer.update(data));
    }
}
