package org.vimal.java;

import org.vimal.java.strategyDesignPattern.CompressionContext;
import org.vimal.java.strategyDesignPattern.RarCompression;
import org.vimal.java.strategyDesignPattern.ZipCompression;

public class Main {
    public static void main(String[] args) {
	// write your code here
        CompressionContext compressionContext = new CompressionContext(new ZipCompression());
        compressionContext.compress();   // zip compression strategy

        compressionContext.setCompressionStrategy(new RarCompression());
        compressionContext.compress();         // rar compression strategy

    }
}
