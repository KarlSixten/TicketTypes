public class SmartTicket extends Ticket{
    private int bagsUnderSeat = 1;
    private int handLuggage = 1;
    private int checkedInBag = 1;
    private String type = "Smart Ticket";

    @Override
    public String toString() {
        return type + "/n" +
                "Bag under seat (40x30x15 cm): " + bagsUnderSeat + "\n" +
        "1 x 8 Hand Luggage (55x40x23 cm): " + handLuggage + "\n" +
                "1 x 23kg Checked in bag: " + checkedInBag;

    }
}
