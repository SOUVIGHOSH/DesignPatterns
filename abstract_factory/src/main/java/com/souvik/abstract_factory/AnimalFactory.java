package com.souvik.abstract_factory;
public abstract class AnimalFactory {
    protected abstract Tiger createTiger(String color);
    protected abstract Dog createDog(String color);
}
