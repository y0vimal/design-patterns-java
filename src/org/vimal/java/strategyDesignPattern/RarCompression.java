package org.vimal.java.strategyDesignPattern;

public class RarCompression implements CompressionStrategy{

    @Override
    public void compressionStrategy() {
        System.out.println("rar compression strategy");
    }
}
