package edu.ticket.strategy;

import edu.ticket.Ticket;

public class BugResponseStrategy implements ResponseStrategy {
    @Override
    public String generateResponse(Ticket ticket) {
        return "Thank you for reporting the bug. Our engineering team is investigating issue: " 
               + ticket.getRequest();
    }
}