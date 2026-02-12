package edu.ticket.strategy;

import edu.ticket.Ticket;

public class BugAssignmentStrategy implements AssignmentStrategy {
    @Override
    public String assign(Ticket ticket) {
        return "Assigned to engineering team";
    }
}
