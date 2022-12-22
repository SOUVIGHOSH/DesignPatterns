package com.souvik.factory;

import lombok.Setter;

@Setter
public abstract class EnemyShip {
    private String name;
    private int damage;

    public void mainObjective(){
        System.out.println(name+" following Hero Ship");
    }
    public void doesDamage(){
        System.out.println(name+" attacks and does damage "+damage);
    }
}
