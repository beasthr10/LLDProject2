package com.beasthr10.lldproject2.models;

import java.util.List;

public class EVParkingSpot extends ParkingSpot{
    private Meter meter;


    public EVParkingSpot(List<VehicleType> supportedVehicleTypes, ParkingSpotStatus parkingSpotStatus, int spotNumber, ParkingFloor parkingFloor) {
        super(supportedVehicleTypes, parkingSpotStatus, spotNumber, parkingFloor);
    }
}
