package com.souvik.factory;

public class EnemyShipFactory {
    static EnemyShip ship=null;
    public static EnemyShip makeEnemyShip(String type){
        switch (type){
            case "M":
                ship=new MilitantShip();
                return ship;
            case "A":
                ship= new AlienEnemyShip();
                return ship;
            default:
                return ship;
        }
    }
}
