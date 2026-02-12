package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.TicketState;

public class ResolvedState implements TicketState {
    @Override
    public void handle(Ticket ticket, TicketService service) {
        System.out.println("Ticket #" + ticket.getId() + " has been resolved.");
        System.out.println("Notifying user: " + ticket.getResponse());

        ticket.setState(new ClosedState());
    }
}