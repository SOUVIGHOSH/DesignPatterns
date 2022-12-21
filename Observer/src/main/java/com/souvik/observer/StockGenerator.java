package com.souvik.observer;

import java.util.ArrayList;
import java.util.List;

public class StockGenerator implements Subject{
    List<Observer> consumerList =new ArrayList<>();
    private int AAPL,MSFT,GOOG,ORCL;


    public void setAAPL(int AAPL) {
        this.AAPL = AAPL;
        publish();

    }


    public void setMSFT(int MSFT) {
        this.MSFT = MSFT;
        publish();
    }


    public void setGOOG(int GOOG) {
        this.GOOG = GOOG;
        publish();
    }


    public void setORCL(int ORCL) {
        this.ORCL = ORCL;
        publish();
    }

    @Override
    public void register(Observer observer) {
        consumerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        int index = consumerList.indexOf(observer);
        consumerList.remove(index);
    }

    @Override
    public void publish() {
        for(Observer observer:consumerList) observer.update(String.format("%d %d %d %d",AAPL,MSFT,GOOG,ORCL));
    }
}
