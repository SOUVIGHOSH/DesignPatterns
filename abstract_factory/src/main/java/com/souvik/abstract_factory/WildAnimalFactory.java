package com.souvik.abstract_factory;

public class WildAnimalFactory extends AnimalFactory{
    @Override
    protected Tiger createTiger(String color) {
        return new WildTiger("White");
    }

    @Override
    protected Dog createDog(String color) {
        return new WildDog("Black");
    }
}
