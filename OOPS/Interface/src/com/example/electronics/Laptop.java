package com.example.electronics;

public class Laptop implements Device {
    private String model;
    private boolean isDocked;

    public Laptop(){

    }

    // Constructor
    public Laptop(String model, boolean isDocked) {
        this.model = model;
        this.isDocked = isDocked;
    }

    // Implementing abstract method from Device
    @Override
    public void turnOn() {
        System.out.println("Laptop " + model + " is booting up.");
    }

    // Implementing abstract method from Device
    @Override
    public void displayInfo() {
        System.out.println("Laptop Model: " + model + ", Docked: " + isDocked);
    }
}