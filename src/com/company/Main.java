package com.company;

public class Main {

    public static void main(String[] args) {
        Material m = new Material("Concrete", 3);
        House house = new House(12, Color.WHITE, m , 200, "Manas");
        house.getInfo();

        House house1 = new House(12, Color.BLACK, new Material("Brick", 2), 50, "7 Microdistrict");
        house1.getInfo();

        house1.finalHouse(184, 6, "Chiskaya 93");
        Room room = new Room(31, Color.WHITE, new Material("Concrete", 5), 123, "Kievskaya 55",
                "Papers", 5, 4);
        room.getInfo();
    }
}