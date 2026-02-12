package edu.ticket;

public class TicketLogger {

    public void logTransition(Ticket ticket, String fromStatus, String toStatus) {
        System.out.println("[LOG] Ticket #" + ticket.getId() +
                           " transitioned: " + fromStatus + " → " + toStatus);
    }

    public void logHandling(Ticket ticket, String message) {
        System.out.println("[LOG] " + message + " (Ticket #" + ticket.getId() + ")");
    }
}