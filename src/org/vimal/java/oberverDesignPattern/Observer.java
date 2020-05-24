package org.vimal.java.oberverDesignPattern;

import org.vimal.java.oberverDesignPattern.model.SensorData;

public interface Observer {
    public void update(SensorData sensorData);
}
