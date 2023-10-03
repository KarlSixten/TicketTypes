public class SmartBioTicket extends Ticket{
    String type;
    int bagUnderSeat;
    int handLuggage;
    int checkedInBag;

    public SmartBioTicket(){
        type = "Bio Ticket";
        bagUnderSeat = 1;
        handLuggage = 1;
        checkedInBag=1;
    }
    public String toString(){
        return type + "\n"+
                "Bag under seat(40x30x15 cm): " + bagUnderSeat + "\n" +
                "1 x 8 Hand Luggage (55x40x23 cm): " + handLuggage + "\n" +
                "1 x 23kg Checked in bag: " + checkedInBag + "\n" +
                "THIS TICKET IS GOOD FOR ENVIRONMENT";


    }
}
