package com.example.electronics;

public class Main {
    public static void main(String[] args) {
        // Create a Smartphone object
        Smartphone phone = new Smartphone("Galaxy X", 50);
        System.out.println("Manufacturer: " + Device.getManufacturer()); // Static method
        phone.turnOn();
        phone.displayInfo();
        phone.charge();  // From Powerable
        phone.shutdown(); // Overridden default method

        System.out.println("\n---\n");

        // Create a Laptop object
        Device laptop = new Laptop("ThinkPad Z", true); // Polymorphism with interface type
        System.out.println("Manufacturer: " + Device.getManufacturer()); // Static method
        laptop.turnOn();
        laptop.displayInfo();
        laptop.shutdown(); // Default method from Device
        System.out.println(Device.getManufacturer());
    }
}