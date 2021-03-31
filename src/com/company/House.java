package com.company;

public class House extends Building{

    private int square;
    private int quantityRoom;
    private String address;


    public House(int height, Color color, Material material, int square,String address) {
        super(height, color, material);
        this.square = square;
        this.address = address;
    }

    @Override
    public void getInfo() {
        super.getInfo();
        System.out.println("\nheight: "+ getHeight()+ "\n" +
                "Color: "+ getColor() + "\n" +
                "Material: "+ getMaterial()+"\n" +
                "Square: "+ getSquare()+"\n" +
                "Address: "+getAddress()+"\n");
    }

    public final void finalHouse(int square, int quantityRoom, String address) {
        this.square = square;
        this.quantityRoom = quantityRoom;
        this.address = address;
        System.out.println("Square: " + getSquare()+"\nQuantity: " +
                getQuantityRoom()+"\nAddress: " +getAddress());
    }

    public int getSquare() {
        return square;
    }

    public int getQuantityRoom() {
        return quantityRoom;
    }

    public String getAddress() {
        return address;
    }


}
