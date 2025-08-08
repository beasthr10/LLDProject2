package com.beasthr10.lldproject2.repository;

import com.beasthr10.lldproject2.models.ParkingLot;
import com.beasthr10.lldproject2.models.ParkingSpot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepo {
    Map<Long, ParkingLot> parkingLotRepo= new HashMap<>();

    private long lastsavedId;

    //not a thread-safe implementation, but for simplicity in this example
    //need to handle concurrency in a real-world application
    public ParkingLotRepo(Map<Long, ParkingLot> parkingLotRepo) {
        this.parkingLotRepo = parkingLotRepo;
        this.lastsavedId = 0L;

    }



    public ParkingLot getParkingLotById(Long id) {
        if (id == null || !parkingLotRepo.containsKey(id)) {
            return null; // or throw an exception
        }
        return parkingLotRepo.get(id);
    }



    public ParkingLot saveParkingLot(ParkingLot parkingLot) {
        if (parkingLot == null) {
            return null;
        }
        lastsavedId++;
        parkingLot.setId(lastsavedId);
        parkingLotRepo.put(lastsavedId, parkingLot);
        return parkingLotRepo.get(lastsavedId);
    }



}
