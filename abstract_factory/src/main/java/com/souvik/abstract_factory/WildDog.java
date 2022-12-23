package com.souvik.abstract_factory;

public class WildDog implements Dog{
    String color;
    WildDog(String color){
        this.color=color;
    }
    @Override
    public void getDescription() {
        System.out.println("I am a wild dog ,my color is "+color);
    }
}
