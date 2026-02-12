package edu.ticket.strategy;

import edu.ticket.Ticket;

public class GenericResponseStrategy implements ResponseStrategy {
    @Override
    public String generateResponse(Ticket ticket) {
        return "Thank you for your request. Our support team will get back to you soon.";
    }
}