package com.example.phone;

public class IPhone extends Phone implements Ringable {

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }

    @Override
    public String displayInfo() {
       return String.format(this.getVersionNumber(),this.getCarrier());
    }

    @Override
    public String ring() {
        return String.format(this.getVersionNumber(), this.getRingTone());
    }

    @Override
    public String unlock() {
        return ("Unlocking");
    }
}
