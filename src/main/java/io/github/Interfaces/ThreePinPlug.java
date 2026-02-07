package io.github.Interfaces;

public interface ThreePinPlug {
    
    void accessPower(); //by nature, it's an abstract method

    default void checkStatus(){   //implementing classes do not have to implement this. They can at 
        //their own wish. They can also override it.
        System.out.println("Checking status ...");
    }

    static void printDetails(){ //cannot be overridden. Can be called in child's method.
        System.out.println("printing details");
    }

}
