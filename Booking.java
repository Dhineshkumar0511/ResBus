public class Booking {
    private String passengerName;
    private int busNo;
    private int seatsBooked;

    public Booking(String passengerName, int busNo, int seatsBooked) {
        this.passengerName = passengerName;
        this.busNo = busNo;
        this.seatsBooked = seatsBooked;
    }

    public void displayBooking() {
        System.out.println("Passenger: " + passengerName +
                " | Bus No: " + busNo +
                " | Seats Booked: " + seatsBooked);
    }
}
