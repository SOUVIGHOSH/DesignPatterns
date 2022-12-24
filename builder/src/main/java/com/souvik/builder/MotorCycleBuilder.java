package com.souvik.builder;

public class MotorCycleBuilder implements Builder {

    Vehicle motorCycle;
    @Override
    public void setName(String name) {
        ((MotorCycle)motorCycle).setName(name);
    }

    @Override
    public void setColor(String color) {
        ((MotorCycle)motorCycle).setColor(color);
    }

    @Override
    public void setWheels(int wheels) {
        ((MotorCycle)motorCycle).setWheels(2);
    }

    @Override
    public void setEngine(int capacity) {
        ((MotorCycle)motorCycle).setEngine(capacity);
    }

    @Override
    public Vehicle getProduct() {
        return motorCycle;
    }

    @Override
    public void createProduct() {
        motorCycle = new MotorCycle();
    }

}
