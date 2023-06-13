package StructuralPatterns.BridgePattern;

public class SonyTV implements Device {

    @Override
    public void setChannel(int number) {
        System.out.println("Sony set channel");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony remote turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony remote turned off");
    }

}
