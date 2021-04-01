package com.company;

public final class Room extends House {
    private String wallpaper;
    private int doors;
    private int window;

    public Room(int height, Color color, Material material, int square, String address, String wallpaper,int doors, int window) {
        super(height, color, material, square, address);
        this.wallpaper = wallpaper;
        this.doors = doors;
        this.window = window;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("\n     Room    "+"\nWallpapers: "+getWallpaper()+"\n" +
                "Doors: "+getDoors()+"\n" +
                "Window: " + getWindow()+ "\n" + "Material: " + getMaterial().getMaterial());
    }
    public String getWallpaper() {
        return wallpaper;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindow() {
        return window;
    }
}
