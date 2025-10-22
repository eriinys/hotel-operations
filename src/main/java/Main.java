import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        Room room;
        Reservation reservation = new Reservation();
        Employee employee = new Employee();

        while (true) {
            System.out.println("""
                    Welcome to Hotel! 
                    Please choose from the following option:
                    A) Guest
                    B) Employee""");
            String choice = myScanner.nextLine().toUpperCase();
            switch (choice) {
                case "A" -> {
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
                case "B" -> {
                    System.out.println("""
                            Choose from following option:
                            I) Puching In
                            O) Punchin Out
                            """);
                    String option = myScanner.nextLine().toUpperCase();
                    switch (option){
                        case "I" -> {
                            LocalTime timeNow = LocalTime.now();
                            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                            double time = Double.parseDouble(timeNow.format(timeFormatter).toString().replace(":" , "."));
                            employee.punchTimeCard(true, time);
                        }
                        case "O" -> {
                            LocalTime timeNow = LocalTime.now();
                            DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm");
                            double time = Double.parseDouble(timeNow.format(timeFormatter).toString().replace(":" , "."));
                            employee.punchTimeCard(false, time);
                        }
                    }

                }
            }
        }

    }
}
