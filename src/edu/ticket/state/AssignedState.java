package edu.ticket.state;
import edu.ticket.strategy.AssignmentStrategy;
import edu.ticket.strategy.BugAssignmentStrategy;
import edu.ticket.strategy.SupportAssignmentStrategy;

public class AssignedState implements TicketState {
    private AssignmentStrategy strategy;

    public AssignedState() {
    }

    @Override
    public void handle(Ticket ticket, TicketService service) {
        if ("BUG".equals(ticket.getType())) {
            strategy = new BugAssignmentStrategy();
        } else {
            strategy = new SupportAssignmentStrategy();
        }

        String assignmentMessage = strategy.assign(ticket);
        System.out.println(assignmentMessage);

        ticket.setState(new InProgressState());
    }
}