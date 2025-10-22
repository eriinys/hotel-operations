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
        Hotel hotel = new Hotel("hotel",10, 20, 7, 15);

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
                            Choose from following options:
                            R) Book a room
                            P) Check room price""");
                    String choice2 = myScanner.nextLine().toUpperCase();
                    switch (choice2) {
                        case "R" -> {
                            System.out.println("How many rooms are you booking today?:");
                            int numberOfRooms = Integer.parseInt(myScanner.nextLine());

                            System.out.println("Do you want the rooms to be suites?: ");
                            boolean isSuite = false;
                            String answer = myScanner.nextLine();
                            if (answer.equalsIgnoreCase("yes")){
                                isSuite = true;
                            } else if (answer.equalsIgnoreCase("no")) {
                                isSuite =false;
                            } else {
                                System.err.println("Invalid input.");
                            }
                            hotel.bookRoom(numberOfRooms, isSuite);
                        }

                        case "P" -> {
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
                }

                case "B" -> {
                    System.out.println("""
                            Choose from following options:
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
