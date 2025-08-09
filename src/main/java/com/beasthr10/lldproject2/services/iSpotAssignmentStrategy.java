package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.models.ParkingLot;
import com.beasthr10.lldproject2.models.ParkingSpot;
import com.beasthr10.lldproject2.models.VehicleType;

public interface iSpotAssignmentStrategy {
    ParkingSpot findParkingSpot(VehicleType vehicleType, ParkingLot parkingLot);
}
