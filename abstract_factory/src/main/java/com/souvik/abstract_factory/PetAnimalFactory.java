package com.souvik.abstract_factory;

public class PetAnimalFactory extends AnimalFactory {

    @Override
    protected Tiger createTiger(String color) {
        return new PetTiger("Yellow");
    }

    @Override
    protected Dog createDog(String color) {
        return new PetDog("White");
    }
}
