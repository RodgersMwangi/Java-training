package io.github.Interfaces;

public class Main {
    public static void main(String[] args) {
        
        ThreePinPlug laptopCharger = new LaptopCharger();
        ThreePinPlug phoneCharger = new PhoneCharger();
        laptopCharger.accessPower();
        laptopCharger.checkStatus();
        phoneCharger.checkStatus();
        ThreePinPlug.printDetails();

    }
}
