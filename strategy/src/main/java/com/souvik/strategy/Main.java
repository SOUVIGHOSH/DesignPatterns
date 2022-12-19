package com.souvik.strategy;

public class Main{
    public static void main(String[] args){
       Animal dog=new Dog("Alsatian",new NoFly());
       Animal bird= new Bird("parrot",new Fly());
       dog.tryToFly();
       bird.tryToFly();
       dog.setFlyBehavior(new Fly());
       bird.setFlyBehavior(new NoFly());
       dog.tryToFly();
       bird.tryToFly();
    }
}