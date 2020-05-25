package org.vimal.java;

import org.vimal.java.FactoryDesignPattern.*;
import org.vimal.java.oberverDesignPattern.SensorLogger;
import org.vimal.java.oberverDesignPattern.SensorReceiver;
import org.vimal.java.oberverDesignPattern.model.SensorData;
import org.vimal.java.strategyDesignPattern.CompressionContext;
import org.vimal.java.strategyDesignPattern.RarCompression;
import org.vimal.java.strategyDesignPattern.ZipCompression;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
	    // Strategy pattern main code
        /* CompressionContext compressionContext = new CompressionContext(new ZipCompression());
        compressionContext.compress();   // zip compression strategy

        compressionContext.setCompressionStrategy(new RarCompression());
        compressionContext.compress();         // rar compression strategy

        // using lambda

        compressionContext.setCompressionStrategy(() -> System.out.println("zip compression using lambda"));
        compressionContext.compress();

        compressionContext.setCompressionStrategy(() -> System.out.println("rar compression using lambda"));
        compressionContext.compress();*/


        // observer pattern main code

        /*SensorReceiver sensorReceiver = new SensorReceiver();
        SensorLogger sensorLogger1 = new SensorLogger("sensorlogger1");
        SensorLogger sensorLogger2 = new SensorLogger("sensorlogger2");
        sensorReceiver.register(sensorLogger1);
        sensorReceiver.register(sensorLogger2);
        sensorReceiver.changeData(new SensorData("earthQuake", "7.5"));

        sensorReceiver.unregister(sensorLogger1);
        sensorReceiver.changeData(new SensorData("earthQuake", "7.8"));*/

        // Factory design pattern
        Scanner scanner = new Scanner(System.in);
        String readerType = scanner.hasNext() ? scanner.nextLine() : null;

        Reader  reader = null;
        ReaderFactory readerFactory = new ReaderFactory();
        reader = readerFactory.getReader(readerType);

        if(reader != null) reader.read();
        else System.out.println("no valid reader Type found.");

    }
}
