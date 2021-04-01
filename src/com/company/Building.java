package com.company;

public class Building {
    private int height;
    private Color color;
    private Material material;


    public Building(int height, Color color,Material  material) {
        this.height = height;
        this.color = color;
        this.material = material;
    }
    
    public void getInfo() {
        System.out.println(
                "Height: " + height +
                "\nColor: " + color + "" +
                "\nMaterial: " + material.getMaterial() +
                        "\nLayer:" + material.getLayer());
    }


    public Color getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public Material getMaterial() {
        return material;
    }
}

