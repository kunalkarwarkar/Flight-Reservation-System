public class Main {

    public static void main(String[] args) {
        Ticket regularTicket = new RegularTicket("11111", "bangalore",
                "Mumbai", "DepartureDateTime", "ArrivalDateTime",
                "12A", 3000, false, null, null, "lunch");

        Ticket touristTicket = new TouristTicket("22222", "Goa", "Dubai",
                "DepartureDateTime", "ArrivalDateTIme",
                "11B", 10000, false, null, null,
                "Dubai Hotel", new String[]{""});

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);
    }

    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnr());
    }

}