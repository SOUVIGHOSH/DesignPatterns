package com.souvik.abstract_factory;

public class PetDog implements Dog{
    String color;
    PetDog(String color){
        this.color=color;
    }
    @Override
    public void getDescription() {
        System.out.println("I am a pet dog ,my color is "+color);
    }
}
