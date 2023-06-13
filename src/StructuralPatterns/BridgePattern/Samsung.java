package StructuralPatterns.BridgePattern;

public class Samsung implements Device {

    @Override
    public void turnOn() {
        System.out.println("Samsung turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung turned off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("channel set");
    }

}
