package com.beasthr10.lldproject2.repository;

import com.beasthr10.lldproject2.models.Gate;
import com.beasthr10.lldproject2.models.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class GateRepo {

    Map<Long, Gate> gateRepo= new HashMap<>();

    private long lastsavedId;

    //not a thread-safe implementation, but for simplicity in this example
    //need to handle concurrency in a real-world application
    public GateRepo(Map<Long, Gate> gateRepo) {
        this.gateRepo = gateRepo;
        this.lastsavedId = 0L;

    }



    public Gate getGateById(Long id) {
        if (id == null || !gateRepo.containsKey(id)) {
            return null; // or throw an exception
        }
        return gateRepo.get(id);
    }



    public Gate saveGate(Gate gate) {
        if (gate == null) {
            return null;
        }
        lastsavedId++;
        gate.setId(lastsavedId);
        gateRepo.put(lastsavedId, gate);
        return gateRepo.get(lastsavedId);
    }



}
