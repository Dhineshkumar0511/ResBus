import java.util.ArrayList;
import java.util.Scanner;

public class ResBusApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Booking> bookings = new ArrayList<>();

        buses.add(new Bus(101, "Chennai - Bangalore", 40));
        buses.add(new Bus(102, "Coimbatore - Chennai", 35));
        buses.add(new Bus(103, "Madurai - Trichy", 30));

        int choice;

        do {
            System.out.println("\n=== ResBus - Bus Reservation System ===");
            System.out.println("1. View Buses");
            System.out.println("2. Book Ticket");
            System.out.println("3. View Bookings");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    for (Bus bus : buses) {
                        bus.displayBus();
                    }
                    break;

                case 2:
                    System.out.print("Enter Passenger Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();

                    System.out.print("Enter Bus Number: ");
                    int busNo = sc.nextInt();

                    System.out.print("Enter Seats to Book: ");
                    int seats = sc.nextInt();

                    boolean booked = false;

                    for (Bus bus : buses) {
                        if (bus.getBusNo() == busNo) {
                            if (bus.bookSeat(seats)) {
                                bookings.add(new Booking(name, busNo, seats));
                                System.out.println("Ticket booked successfully!");
                            } else {
                                System.out.println("Not enough seats available.");
                            }
                            booked = true;
                            break;
                        }
                    }

                    if (!booked) {
                        System.out.println("Bus not found.");
                    }
                    break;

                case 3:
                    if (bookings.isEmpty()) {
                        System.out.println("No bookings found.");
                    } else {
                        for (Booking booking : bookings) {
                            booking.displayBooking();
                        }
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ResBus!");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
