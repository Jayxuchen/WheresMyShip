package com.wheresmyship.shipmentprovider;

public class ShipmentProvider {

    private String name;

    public enum names{
        USPS,UPS,FEDEX;
    }

    public ShipmentProvider(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
