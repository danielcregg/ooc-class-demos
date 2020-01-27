package ie.gmit.lecw3;

public class Car {
    // Instance variables
    int topSpeed;
    int totalSeats;
    int fuelCapacity;
    String manufacturer;
    String colour;
    String owner;
    float engineSize;
    float value;

    // Class Methods
    void show(){
        System.out.println(manufacturer);
    }
    
    void crash(){
        value = 0;
    }

}