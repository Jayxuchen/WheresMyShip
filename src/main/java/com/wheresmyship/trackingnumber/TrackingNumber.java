package com.wheresmyship.trackingnumber;

import com.wheresmyship.shipmentprovider.ShipmentProvider;

public class TrackingNumber {
    private String number;
    private ShipmentProvider shipmentProvider;
    public TrackingNumber(String number, ShipmentProvider shipmentProvider){
        this.number = number;
        this.shipmentProvider = shipmentProvider;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ShipmentProvider getShipmentProvider() {
        return shipmentProvider;
    }

    public void setShipmentProvider(ShipmentProvider shipmentProvider) {
        this.shipmentProvider = shipmentProvider;
    }
}
