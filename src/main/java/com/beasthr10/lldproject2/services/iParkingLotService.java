package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.dto.ParkingLotInputDTO;
import com.beasthr10.lldproject2.dto.ParkingLotResponseDTO;
import com.beasthr10.lldproject2.models.ParkingLot;

public interface iParkingLotService {

    void createParkingLot(ParkingLotInputDTO parkingLotInputDTO);

    ParkingLotResponseDTO getParkingLotById(Long id);

}
