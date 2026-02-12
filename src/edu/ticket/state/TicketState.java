package edu.ticket.state;
import edu.ticket.TicketService;
import edu.ticket.Ticket;


public interface TicketState {
    void handle(Ticket ticket, TicketService service);
}