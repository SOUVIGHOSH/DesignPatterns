package com.souvik.builder;

public class MotoCycleDirector implements Director{
    Builder builder=new MotorCycleBuilder();
    Vehicle motorCycle;
    @Override
    public void instruct() {
        builder.createProduct();
        builder.setName("Avenger");
        builder.setColor("Blue");
        builder.setWheels(2);
        builder.setEngine(150);
        motorCycle=builder.getProduct();
    }

    public Vehicle deliver(){
        return motorCycle;
    }

}
