package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.builder.ParkingLotMapper;
import com.beasthr10.lldproject2.dto.ParkingLotInputDTO;
import com.beasthr10.lldproject2.dto.ParkingLotResponseDTO;
import com.beasthr10.lldproject2.models.ParkingLot;
import com.beasthr10.lldproject2.repository.ParkingLotRepo;

public class ParkingLotServiceImpl implements iParkingLotService{

    private ParkingLotRepo repo;
    private ParkingLotMapper mapper;

    public ParkingLotServiceImpl(ParkingLotRepo repo, ParkingLotMapper mapper) {
        this.mapper = mapper;
        this.repo = repo;
    }

    @Override
    public void createParkingLot(ParkingLotInputDTO parkingLotInputDTO) {

    }

    @Override
    public ParkingLotResponseDTO getParkingLotById(Long id) {
        ParkingLot parkingLot = repo.getParkingLotById(id);
        ParkingLotResponseDTO responseDTO = mapper.toResponseDTO(parkingLot);
        return responseDTO;
    }
}
