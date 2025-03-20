package com.example.electronics;

// Main interface for all electronic devices
public interface Device {
    // Constant (implicitly public, static, final)
    String MANUFACTURER = "TechCorp";

    // Abstract method (must be implemented by classes)
    void turnOn();

    // Another abstract method
    void displayInfo();

    // Default method (provides a default implementation)
    default void shutdown() {
        System.out.println("Device is shutting down...");
    }

    // Static method (utility method, cannot be overridden)
    static String getManufacturer() {
        return MANUFACTURER;
    }
}