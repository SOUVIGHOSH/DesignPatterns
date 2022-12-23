package com.souvik.abstract_factory;

public class Main {
    public static void main(String[] args) {

        AnimalFactory petFactory= new PetAnimalFactory();
        Client petClient = new Client(petFactory);
        Dog petDog = petClient.produceDog("White");
        Tiger petTiger=petClient.produceTiger("Yelloe");
        petDog.getDescription();
        petTiger.getDescription();

        AnimalFactory wildFactory= new WildAnimalFactory();
        Client wildClient = new Client(wildFactory);
        Dog wildDog = wildClient.produceDog("Black");
        Tiger wildTiger=wildClient.produceTiger("White");
        wildDog.getDescription();
        wildTiger.getDescription();
    }
}
