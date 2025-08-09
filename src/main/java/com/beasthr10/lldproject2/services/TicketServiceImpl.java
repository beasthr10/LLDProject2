package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.builder.TicketMapper;
import com.beasthr10.lldproject2.dto.TicketResponseDTO;
import com.beasthr10.lldproject2.models.*;
import com.beasthr10.lldproject2.repository.GateRepo;
import com.beasthr10.lldproject2.repository.ParkingLotRepo;
import com.beasthr10.lldproject2.repository.TicketRepo;

public class TicketServiceImpl implements iTicketService{
    private TicketRepo ticketRepo;
    private TicketMapper mapper;
    private ParkingLotRepo parkingLotRepo;
    private GateRepo gateRepo;
    private iSpotAssignmentStrategy spotAssignmentStrategy;

    public TicketServiceImpl(TicketRepo ticketRepo, TicketMapper mapper, ParkingLotRepo parkingLotRepo, GateRepo gateRepo,
                             iSpotAssignmentStrategy spotAssignmentStrategy) {
        this.spotAssignmentStrategy = spotAssignmentStrategy;
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
        Gate gate = gateRepo.getGateById(gateId);
        if(gate==null){
            throw new IllegalArgumentException("Gate not found");
        }
        // Find a parking spot using the strategy
        ParkingSpot parkingSpot = spotAssignmentStrategy.findParkingSpot(vehicleNumber.getVehicleType(), parkingLot);
        if(parkingSpot==null){
            throw new RuntimeException("No available parking spot found for vehicle type: " + vehicleNumber.getVehicleType());
        }
        // Create a ticket
        Ticket ticket = new Ticket(vehicleNumber, gate, gate.getCurrentOperator(), parkingSpot);
        // Save the ticket in the repository
        Ticket generateTicket = ticketRepo.createTicket(ticket);
        if(generateTicket==null){
            throw new RuntimeException("Ticket generation failed");
        }
        // Map the ticket to a response DTO
        TicketResponseDTO responseDTO = mapper.toResponseDTO(generateTicket);





        return null;
    }
}
