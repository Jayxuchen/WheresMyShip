package com.wheresmyship.trackingnumber;

import java.util.List;

public interface TrackingNumberInterface {
    List<TrackingNumber> getTrackingNumbersById(String id);
    void addTrackingNumberById(TrackingNumber trackingNumber, String id);
}
