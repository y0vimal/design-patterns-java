package org.vimal.java.strategyDesignPattern;

public class ZipCompression implements CompressionStrategy{

    @Override
    public void compressionStrategy() {
        System.out.println("zip compression strategy");
    }
}
