package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Ticket extends BaseModel{
    private String number;
    private Date entryTime;
    private Vehicle vehicle;
    private ParkingSpot parkingSpot;
    private Gate generatedAt;
    private Operator generatedBy;

    public Ticket(Vehicle vehicle,  Gate gate, Operator operator,ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.generatedAt = gate;
        this.generatedBy = operator;
        this.parkingSpot = parkingSpot;
        this.entryTime = new Date();
    }


}
