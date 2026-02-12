package edu.ticket.state;
import edu.ticket.Ticket;
import edu.ticket.TicketService;

public class NewState implements TicketState {
    @Override
    public void handle(Ticket ticket, TicketService service) {
        System.out.println("Ticket created");
        
        if ("WEB".equals(ticket.getChannel())) {
            System.out.println("Received from web");
        } else if ("EMAIL".equals(ticket.getChannel())) {
            System.out.println("Received from email");
        }
        
        System.out.println("Logging: Ticket " + ticket.getId() + " → ASSIGNED");
        
        ticket.setState(new AssignedState());
    }
}