package com.beasthr10.lldproject2.repository;

import com.beasthr10.lldproject2.models.Gate;
import com.beasthr10.lldproject2.models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepo {

    Map<Long, Ticket> ticketRepo= new HashMap<>();

    private long lastsavedId;

    //not a thread-safe implementation, but for simplicity in this example
    //need to handle concurrency in a real-world application
    public TicketRepo(Map<Long, Ticket> ticketRepo) {
        this.ticketRepo = ticketRepo;
        this.lastsavedId = 0L;

    }



    public Ticket getTicketById(Long id) {
        if (id == null || !ticketRepo.containsKey(id)) {
            return null; // or throw an exception
        }
        return ticketRepo.get(id);
    }



    public Ticket createTicket(Ticket ticket) {
        if (ticket == null) {
            return null;
        }
        lastsavedId++;
        ticket.setId(lastsavedId);
        ticketRepo.put(lastsavedId, ticket);
        return ticketRepo.get(lastsavedId);
    }

}
