package io.github.Abstraction;

public class Car extends Vehicle {
    private int doors;

    public Car(String brand, int year, int doors){
        super(brand, year);
        this.doors=doors;
    }

    @Override
    public void start(){
        System.out.println(brand+ " car starting...");
    }

    @Override
    public void stop(){
        System.out.println("..."+brand+" stopping");
    }
    public void openTrunk(){
        System.out.println("Opening trunk");
    }
    
}
