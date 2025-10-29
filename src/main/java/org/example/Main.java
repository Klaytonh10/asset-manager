package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        Asset house1 = new House(1, 2619, 8600, 649990);
        Asset house2 = new House(3, 3480, 10600, 748900);
        Asset vehicle1 = new Vehicle("Toyota", 2020, 52300, 8990);
        Asset vehicle2 = new Vehicle("Honda", 2001, 100300, 1988);

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        for(Asset asset : assets) {
            System.out.println(asset.getDescription());
        }
    }
}