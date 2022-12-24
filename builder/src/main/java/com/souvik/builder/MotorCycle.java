package com.souvik.builder;

import lombok.Setter;

@Setter
public class MotorCycle implements Vehicle{
    private String name,color;
    private int wheels,engine;
    @Override
    public void getDescription() {
        System.out.println(name+" "+color+" "+wheels+" "+engine);
    }
}
