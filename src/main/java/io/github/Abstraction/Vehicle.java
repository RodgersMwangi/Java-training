package io.github.Abstraction;

public abstract class Vehicle {
    protected String brand;
    protected int year;

    public Vehicle(String brand, int year){
        this.brand=brand;
        this.year=year;
    }

    //concrete method
    public void displayInfo(){
        System.out.println(year+""+brand);
    }

    //Abstract method, no implementation, must be overridden
    public abstract void start();
    public abstract void stop();

    public static void vehicleFact(){
        System.out.println("All cars must be road legal");
    }


}
