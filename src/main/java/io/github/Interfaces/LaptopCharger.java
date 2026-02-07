package io.github.Interfaces;

public class LaptopCharger implements ThreePinPlug{

    @Override
    public void accessPower() {
        System.out.println("Accessing Power");
    }

}
