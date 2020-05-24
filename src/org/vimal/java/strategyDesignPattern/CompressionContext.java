package org.vimal.java.strategyDesignPattern;

public class CompressionContext {
    private CompressionStrategy compressionStrategy;

    public CompressionContext(CompressionStrategy compressionStrategy){
        this.compressionStrategy = compressionStrategy;
    }
    public void setCompressionStrategy(CompressionStrategy compressionStrategy){
        this.compressionStrategy = compressionStrategy;
    }
    public CompressionStrategy getCompressionStrategy(){
        return compressionStrategy;
    }
    public void compress(){
        compressionStrategy.compressionStrategy();
    }
}
