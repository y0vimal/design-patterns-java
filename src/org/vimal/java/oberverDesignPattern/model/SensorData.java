package org.vimal.java.oberverDesignPattern.model;

public class SensorData {
    private String sensor;
    private String measure;

    public SensorData(String sensor, String measure){
        this.sensor = sensor;
        this.measure = measure;
    }

    @Override
    public String toString() {
        return "SensorData{" +
                "sensor='" + sensor + '\'' +
                ", measure='" + measure + '\'' +
                '}';
    }
}
