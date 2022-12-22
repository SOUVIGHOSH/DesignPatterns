package com.souvik.factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter what type of ship to generate");
        String option= sc.nextLine();
        EnemyShip ship = EnemyShipFactory.makeEnemyShip(option);
        ship.mainObjective();
        ship.doesDamage();

    }
}
