package com.souvik.abstract_factory;

public class WildTiger implements Tiger {
    String color;
    WildTiger(String color){
        this.color=color;
    }
    @Override
    public void getDescription() {
        System.out.println("I am a wild tiger ,my color is "+color);
    }
}
