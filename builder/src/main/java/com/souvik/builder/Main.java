package com.souvik.builder;

public class Main {
    public static void main(String[] args) {
        MotoCycleDirector director = new MotoCycleDirector();
        director.instruct();
        Vehicle vehicle = director.deliver();
        vehicle.getDescription();
    }
}
