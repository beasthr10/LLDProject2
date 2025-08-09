package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingSpot extends BaseModel{
    private List<VehicleType> supportedVehicleTypes;
    private ParkingSpotStatus parkingSpotStatus;
    private int spotNumber;
    private ParkingFloor parkingFloor;

    public ParkingSpot(List<VehicleType> supportedVehicleTypes, ParkingSpotStatus parkingSpotStatus,
                       int spotNumber, ParkingFloor parkingFloor) {
        this.supportedVehicleTypes = supportedVehicleTypes;
        this.parkingSpotStatus = parkingSpotStatus;
        this.spotNumber = spotNumber;
        this.parkingFloor = parkingFloor;
    }
}
