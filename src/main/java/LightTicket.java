public class LightTicket extends Ticket{
    private int bagsUnderSeat = 1;
    private String type = "Light";

    @Override
    public String toString() {
        return type + "\n" +
                "Bags under seat allowed (40x30x15 cm): " + bagsUnderSeat;
    }
}
