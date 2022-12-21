package com.souvik.observer;

public class StockObserver implements Observer{

    public static int idGenerator=0;
    private Subject stockGenerator;
    private int id;
    public StockObserver(Subject subject) {
        this.id=++idGenerator;
        this.stockGenerator=subject;
        stockGenerator.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println("Stockbserver "+id+" :"+message);
    }
}
