package edu.ticket;
import edu.ticket.state.TicketState;
import edu.ticket.state.NewState;
import edu.ticket.strategy.AssignmentStrategy;
import edu.ticket.strategy.ResponseStrategy;
public class Ticket {
    private int id;
    private TicketState currentState;
    private String channel;
    private String type;
    private String request;
    private String response;

    public Ticket(int id,String channel, String type) {
        this.id = id;
        this.channel = channel;
        this.type = type;
        this.currentState = new NewState();
    }
    public TicketState getState() {
        return currentState;
    }

    public void setState(TicketState state) {
        this.currentState = state;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRequest() {
        return request;
    }

    public void setRequest(String request) {
        this.request = request;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public int getId() {
        return this.id;
    }
}
