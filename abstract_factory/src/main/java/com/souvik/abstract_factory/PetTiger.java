package com.souvik.abstract_factory;

public class PetTiger implements  Tiger{
    String color;
    PetTiger(String color){
        this.color=color;
    }
    @Override
    public void getDescription() {
        System.out.println("Pet Tiger??? I do not exist");
    }
}
