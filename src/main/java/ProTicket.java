public class ProTicket extends Ticket{
    private String type = "Pro Ticket";
    private int bagUnderSeat;
    private int handLuggage;
    private int checkedInBag;

    public ProTicket(){
        bagUnderSeat = 1;
        handLuggage = 1;
        checkedInBag = 2;

    }
    public String toString(){
        return type + "\n" +
                "Bag under seat: " + bagUnderSeat + "\n"+
                "Hand Luggage: " + handLuggage + "\n" +
                "Checked in bag: " + checkedInBag;
    }

}
