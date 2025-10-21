import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class Reservation {
    private String roomType;
    double price;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;
    private int reservationTotal;

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
    }

    public double price(){
        price = pricePerNight * numberOfNights;
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        DayOfWeek today = LocalDate.now().getDayOfWeek();
        if (today == SATURDAY || today == SUNDAY){
            return isWeekend = true;
        } else {
            return isWeekend = false;
        }
    }
    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public int getReservationTotal() {
        return reservationTotal;
    }
    public void setReservationTotal(int reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

    public double getPricePerNight(){
        if (roomType.equalsIgnoreCase("king")) {
            pricePerNight = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            pricePerNight = 124.00;
        }

        if (isWeekend) {
            pricePerNight = pricePerNight + (pricePerNight * 0.10);
        }

        return pricePerNight;
    }


}
