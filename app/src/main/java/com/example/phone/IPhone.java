package com.example.phone;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public void displayInfo() {

    }

    @Override
    public String ring() {
        return null;
    }

    @Override
    public String unlock() {
        return null;
    }
}
