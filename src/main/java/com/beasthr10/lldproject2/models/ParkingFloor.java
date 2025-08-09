package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ParkingFloor extends BaseModel{
    private List<ParkingSpot> parkingSpots;
    private int floorNumber;

    public ParkingFloor(int floorNo,List<ParkingSpot> spots) {
        this.floorNumber = floorNo;
        this.parkingSpots = spots;
    }
}
