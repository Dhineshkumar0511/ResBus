public class Bus {
    private int busNo;
    private String route;
    private int totalSeats;
    private int availableSeats;

    public Bus(int busNo, String route, int totalSeats) {
        this.busNo = busNo;
        this.route = route;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
    }

    public int getBusNo() {
        return busNo;
    }

    public String getRoute() {
        return route;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public boolean bookSeat(int seats) {
        if (seats <= availableSeats) {
            availableSeats -= seats;
            return true;
        }
        return false;
    }

    public void displayBus() {
        System.out.println("Bus No: " + busNo +
                " | Route: " + route +
                " | Available Seats: " + availableSeats);
    }
}
