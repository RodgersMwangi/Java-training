package io.github.Interfaces;

public class PhoneCharger implements ThreePinPlug{

    @Override
    public void accessPower() {
        System.out.println("Phone accessing power");
    }

    @Override
    public void checkStatus() {
        System.out.println("Phone checking status");
    }

}
