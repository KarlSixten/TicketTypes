public class Main {
    public static void main(String[] args) {
        TicketList ticketList = new TicketList();


        for (Ticket ticket : ticketList.getTicketArrayList()) {
            System.out.println(ticket + "\n");
        }
    }
}
