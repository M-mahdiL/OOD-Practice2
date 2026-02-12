package edu.ticket;

public class TicketService {

    private final TicketLogger logger = new TicketLogger();

    public void handle(Ticket ticket) {
        String previousStatus = ticket.getState().getClass().getSimpleName().replace("State", "");

        ticket.getState().handle(ticket, this);

        String newStatus = ticket.getState().getClass().getSimpleName().replace("State", "");
        logger.logTransition(ticket, previousStatus, newStatus);
    }
}
