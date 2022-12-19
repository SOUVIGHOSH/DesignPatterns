package com.souvik.strategy;

public class Animal {
    private String name;
    private FlyBehavior flyBehavior;

    public Animal(String name, FlyBehavior flyBehavior) {
        this.name = name;
        this.flyBehavior = flyBehavior;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void tryToFly(){
        System.out.println("Hi! I am "+name);
        flyBehavior.fly();
    }
}
