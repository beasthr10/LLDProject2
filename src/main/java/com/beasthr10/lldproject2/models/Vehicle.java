package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vehicle {
    private String number;
    private VehicleType vehicleType;
    private String ownerName;

    public Vehicle(String number, VehicleType vehicleType, String ownerName) {
        this.number = number;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }
}
