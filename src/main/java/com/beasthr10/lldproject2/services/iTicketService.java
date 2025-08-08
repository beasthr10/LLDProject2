package com.beasthr10.lldproject2.services;

import com.beasthr10.lldproject2.dto.TicketResponseDTO;
import com.beasthr10.lldproject2.models.Ticket;
import com.beasthr10.lldproject2.models.Vehicle;

public interface iTicketService {

    TicketResponseDTO generateTicket(Vehicle vehicleNumber, Long gateId, Long parkingLotId);

}
