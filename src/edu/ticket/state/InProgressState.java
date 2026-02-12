package edu.ticket.state;

import edu.ticket.Ticket;
import edu.ticket.TicketService;
import edu.ticket.TicketState;
import edu.ticket.strategy.BugResponseStrategy;
import edu.ticket.strategy.GenericResponseStrategy;
import edu.ticket.strategy.ResponseStrategy;

public class InProgressState implements TicketState {

    private ResponseStrategy responseStrategy;

    public InProgressState() {
        // می‌توان اینجا یا در Ticket تعیین کرد
    }

    @Override
    public void handle(Ticket ticket, TicketService service) {
        System.out.println("Working on ticket #" + ticket.getId());

        // انتخاب استراتژی پاسخ
        if ("BUG".equals(ticket.getType())) {
            responseStrategy = new BugResponseStrategy();
        } else {
            responseStrategy = new GenericResponseStrategy();
        }

        String response = responseStrategy.generateResponse(ticket);
        ticket.setResponse(response);
        System.out.println("Response generated: " + response);

        ticket.setState(new ResolvedState());
    }
}