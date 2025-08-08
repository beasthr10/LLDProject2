package com.beasthr10.lldproject2.dto;

import com.beasthr10.lldproject2.models.Vehicle;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TicketRequestDTO {
    private Vehicle vehicle;
    private Long gateId;
    private Long parkingLotId;

    public TicketRequestDTO(Vehicle vehicle, Long gateId, Long parkingLotId) {
        this.vehicle = vehicle;
        this.gateId = gateId;
        this.parkingLotId = parkingLotId;
    }

}
