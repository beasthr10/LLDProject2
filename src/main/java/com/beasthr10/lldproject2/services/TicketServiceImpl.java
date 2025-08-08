package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.builder.TicketMapper;
import com.beasthr10.lldproject2.dto.TicketResponseDTO;
import com.beasthr10.lldproject2.models.ParkingLot;
import com.beasthr10.lldproject2.models.Vehicle;
import com.beasthr10.lldproject2.repository.GateRepo;
import com.beasthr10.lldproject2.repository.ParkingLotRepo;
import com.beasthr10.lldproject2.repository.TicketRepo;

public class TicketServiceImpl implements iTicketService{
    private TicketRepo ticketRepo;
    private TicketMapper mapper;
    private ParkingLotRepo parkingLotRepo;
    private GateRepo gateRepo;

    public TicketServiceImpl(TicketRepo ticketRepo, TicketMapper mapper, ParkingLotRepo parkingLotRepo, GateRepo gateRepo) {
        this.ticketRepo = ticketRepo;
        this.mapper = mapper;
        this.parkingLotRepo = parkingLotRepo;
        this.gateRepo = gateRepo;
    }

    @Override
    public TicketResponseDTO generateTicket(Vehicle vehicleNumber, Long gateId, Long parkingLotId) {
        //  S1. check wether parkinglot exists or not from repo
        //  S2. check wether gate and get the operator from the gate
        //  S3. Now you will have to check for the parking spot-- use strategy pattern
        //  S4. If parking spot is available, then create a ticket and save it
        //  S5. Save in the repo and return the response DTO
        ParkingLot parkingLot = parkingLotRepo.getParkingLotById(parkingLotId);
        if(parkingLot==null){
            throw new IllegalArgumentException("Parking lot not found");
        }



        return null;
    }
}
