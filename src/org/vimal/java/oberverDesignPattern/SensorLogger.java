package org.vimal.java.oberverDesignPattern;

import org.vimal.java.oberverDesignPattern.model.SensorData;

public class SensorLogger implements Observer{
    private String observerName ;

    public SensorLogger(String observerName) {
        this.observerName = observerName;
    }

    @Override
    public void update(SensorData sensorData) {
        System.out.println("observer is : " + observerName + " , and updated data is : " + sensorData.toString());
    }
}
