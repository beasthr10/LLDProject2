package com.beasthr10.lldproject2.builder;

import com.beasthr10.lldproject2.dto.ParkingLotInputDTO;
import com.beasthr10.lldproject2.dto.ParkingLotResponseDTO;
import com.beasthr10.lldproject2.models.ParkingLot;

public class ParkingLotMapper {

    //need to implement the conversion methods for ParkingLotInputDTO and ParkingLotResponseDTO
    public ParkingLotResponseDTO toResponseDTO(ParkingLot parkingLot) {
        // Convert ParkingLot to ParkingLotResponseDTO
        ParkingLotResponseDTO responseDTO = new ParkingLotResponseDTO();
        // Set properties from parkingLot to responseDTO
        return responseDTO;
    }

    //need to implement the conversion methods for ParkingLotInputDTO and ParkingLotResponseDTO
    public  ParkingLot toModel(ParkingLotInputDTO inputDTO) {
        // Convert ParkingLotInputDTO to ParkingLot model
        ParkingLot parkingLot = new ParkingLot();
        // Set properties from inputDTO to parkingLot
        return parkingLot;
    }
}
