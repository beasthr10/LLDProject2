package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.models.*;

public class RandomSpotAssignmentStrategy implements iSpotAssignmentStrategy{

    @Override
    public ParkingSpot findParkingSpot(VehicleType vehicleType, ParkingLot parkingLot) {
        ParkingSpot avParkingspot = null;
        for(ParkingFloor floor : parkingLot.getParkingFloors()){
            for(ParkingSpot spot : floor.getParkingSpots()){
                if(spot.getSupportedVehicleTypes().contains(vehicleType) && spot.getParkingSpotStatus().equals(ParkingSpotStatus.EMPTY)){
                    avParkingspot = spot;
                    break;
                }
            }
        }
        if(avParkingspot == null) {
            throw new RuntimeException("No available parking spot found for vehicle type: " + vehicleType);
        }
        return avParkingspot;
    }
}
