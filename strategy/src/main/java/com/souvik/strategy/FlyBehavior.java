package com.souvik.strategy;

public interface FlyBehavior {
    void fly();
}

class Fly implements FlyBehavior{

    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}

class NoFly implements  FlyBehavior{

    @Override
    public void fly() {
        System.out.println("Sorry! I can't fly");
    }
}
