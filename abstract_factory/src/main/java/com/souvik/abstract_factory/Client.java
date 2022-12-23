package com.souvik.abstract_factory;

public class Client {
    private AnimalFactory animalFactory;

    Client(AnimalFactory animalFactory){
        this.animalFactory=animalFactory;
    }

    public Tiger produceTiger(String color){
        return animalFactory.createTiger(color);
    }
    public Dog produceDog(String color){
        return animalFactory.createDog(color);
    }


}
