package com.beasthr10.lldproject2.controller;

import com.beasthr10.lldproject2.dto.ParkingLotInputDTO;
import com.beasthr10.lldproject2.dto.ParkingLotResponseDTO;
import com.beasthr10.lldproject2.models.ParkingLot;
import com.beasthr10.lldproject2.services.iParkingLotService;

public class ParkingLotController {

    private iParkingLotService service;

    public ParkingLotController(iParkingLotService service) {
        this.service = service;
    }

    public void createParkingLot(ParkingLotInputDTO parkingLotInputDTO) {
        // Logic to validate the input DTO can be added here
        service.createParkingLot(parkingLotInputDTO);
    }
    public ParkingLotResponseDTO getParkingLotById(Long id) {
        // Logic to validate the ID can be added here
        ParkingLotResponseDTO response = service.getParkingLotById(id);
        return response;
    }


}
