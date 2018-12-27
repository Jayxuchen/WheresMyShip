package com.wheresmyship.trackingnumber;

import com.wheresmyship.shipmentprovider.ShipmentProvider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TrackingNumberService implements TrackingNumberInterface{
    private List<TrackingNumber> trackingNumberList =new ArrayList<>( Arrays.asList(
            new TrackingNumber("test1", new ShipmentProvider("USPS")),
            new TrackingNumber("test2", new ShipmentProvider("FEDEX"))
    ));

    @Override
    public List<TrackingNumber> getTrackingNumbersById(String id) {
        return trackingNumberList;
    }

    @Override
    public void addTrackingNumberById(TrackingNumber trackingNumber,String id) {
        trackingNumberList.add(trackingNumber);
    }
}
