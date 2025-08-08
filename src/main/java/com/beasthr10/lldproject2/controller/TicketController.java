package com.beasthr10.lldproject2.controller;

import com.beasthr10.lldproject2.dto.TicketRequestDTO;
import com.beasthr10.lldproject2.dto.TicketResponseDTO;
import com.beasthr10.lldproject2.models.Ticket;
import com.beasthr10.lldproject2.services.iTicketService;

public class TicketController {

    private iTicketService ticketService;

    public TicketController(iTicketService ticketService) {
        this.ticketService = ticketService;
    }

    //This method creating a ticket and assign a spot
    public TicketResponseDTO generateTicket(TicketRequestDTO dto) {
        // Validate the request
        TicketResponseDTO ticket = ticketService.generateTicket(dto.getVehicle(),dto.getGateId(),dto.getParkingLotId());
        return ticket;
    }


}
