package edu.ticket.strategy;

import edu.ticket.Ticket;

public interface ResponseStrategy {
    String generateResponse(Ticket ticket);
}