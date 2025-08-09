package com.beasthr10.lldproject2.models;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ParkingLot extends BaseModel{
    private List<ParkingFloor> parkingFloors;
    private List<Gate> gates;
    private List<VehicleType> vehicleTypes;
    private ParkingLotStatus parkingLotStatus;
    private SpotAssignmentStrategyType spotAssignmentStrategyType;
    private FeesCalculatorStrategyType feesCalculatorStrategyType;

    public ParkingLot(List<ParkingFloor> parkingFloors, List<Gate> gates,
                      List<VehicleType> vehicleTypes, ParkingLotStatus parkingLotStatus,
                      SpotAssignmentStrategyType spotAssignmentStrategyType,
                      FeesCalculatorStrategyType feesCalculatorStrategyType) {
        this.parkingFloors = parkingFloors;
        this.gates = gates;
        this.vehicleTypes = vehicleTypes;
        this.parkingLotStatus = parkingLotStatus;
        this.spotAssignmentStrategyType = spotAssignmentStrategyType;
        this.feesCalculatorStrategyType = feesCalculatorStrategyType;
    }

}
