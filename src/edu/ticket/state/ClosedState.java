package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.TicketState;

public class ClosedState implements TicketState {
    @Override
    public void handle(Ticket ticket, TicketService service) {
        System.out.println("Ticket #" + ticket.getId() + " is closed. No further action.");
    }
}