package edu.ticket.strategy;

import edu.ticket.Ticket;

public class SupportAssignmentStrategy implements AssignmentStrategy {
    @Override
    public String assign(Ticket ticket) {
        return "Assigned to support team";
    }
}