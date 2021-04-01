package com.company;

public class Material {
    private String material;
    private int layer;

    public Material(String material, int layer) {
        this.material = material;
        this.layer = layer;
    }

    public String getMaterial() {
        return material;
    }

    public int getLayer() {
        return layer;
    }
}
