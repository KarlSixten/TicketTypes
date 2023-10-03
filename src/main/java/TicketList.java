import java.util.ArrayList;
import java.util.List;

public class TicketList {
    private ArrayList<Ticket> ticketArrayList = new ArrayList(List.of(
            new LightTicket(),
            new SmartTicket(),
            new SmartBioTicket(),
            new LightTicket(),
            new ProTicket(),
            new SmartBioTicket(),
            new LightTicket(),
            new ProTicket()));

    public ArrayList<Ticket> getTicketArrayList() {
        return ticketArrayList;
    }
}
