import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Room room;
        Reservation reservation = new Reservation();
        Employee employee;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("""
                Pick a room type:
                King
                Double""");
        String roomType = myScanner.nextLine();
        reservation.setRoomType(roomType);

        System.out.println("\nNumber of nights staying: ");
        int numOfNights = Integer.parseInt(myScanner.next());
        reservation.setNumberOfNights(numOfNights);

        System.out.printf("Total price: $%.2f", reservation.getReservationTotal());

    }
}
