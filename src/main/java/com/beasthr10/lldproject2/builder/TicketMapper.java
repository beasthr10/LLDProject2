package com.beasthr10.lldproject2.builder;

import com.beasthr10.lldproject2.dto.TicketResponseDTO;
import com.beasthr10.lldproject2.models.Ticket;

public class TicketMapper {
    public TicketResponseDTO toResponseDTO(Ticket generateTicket) {
        return new TicketResponseDTO();
    }
}
