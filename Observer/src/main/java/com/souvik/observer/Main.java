package com.souvik.observer;

public class Main {
    public static void main(String[] args) {
        StockGenerator stockGenerator=new StockGenerator();
        StockObserver stockObserver=new StockObserver(stockGenerator);
        stockGenerator.setAAPL(19);
        stockGenerator.setMSFT(29);
        stockGenerator.setGOOG(99);
        stockGenerator.setORCL(34);

        StockObserver stockObserver2=new StockObserver(stockGenerator);
        stockGenerator.setAAPL(29);
        stockGenerator.setMSFT(19);
        stockGenerator.setGOOG(19);
        stockGenerator.setORCL(74);



    }
}
