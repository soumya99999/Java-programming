package com.example.electronics;

public class Smartphone implements Device, Powerable {
    private String model;
    private int batteryLevel;

    // Constructor
    public Smartphone(String model, int batteryLevel) {
        this.model = model;
        this.batteryLevel = batteryLevel;
    }

    // Implementing abstract method from Device
    @Override
    public void turnOn() {
        System.out.println("Smartphone " + model + " is powering on.");
    }

    // Implementing abstract method from Device
    @Override
    public void displayInfo() {
        System.out.println("Smartphone Model: " + model + ", Battery: " + batteryLevel + "%");
    }

    // Implementing abstract method from Powerable
    @Override
    public void charge() {
        if (batteryLevel < 100) {
            batteryLevel += 20;
            System.out.println(model + " is charging. New battery level: " + batteryLevel + "%");
        } else {
            System.out.println(model + " is fully charged!");
        }
    }

    // Override default method from Device (optional)
    @Override
    public void shutdown() {
        System.out.println("Smartphone " + model + " is shutting down with a fancy animation.");
    }
}