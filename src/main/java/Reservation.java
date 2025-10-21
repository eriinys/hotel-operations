import java.time.DayOfWeek;
import java.time.LocalDate;
import static java.time.DayOfWeek.SATURDAY;
import static java.time.DayOfWeek.SUNDAY;

public class Reservation {
    private String roomType;
    private double pricePerNight;
    private int numberOfNights;
    private boolean isWeekend;
    private double reservationTotal;

    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType){
        this.roomType = roomType;
        this.pricePerNight = 0;
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

    public double getPricePerNight(){
        double base;
        if (roomType.equalsIgnoreCase("king")) {
            base = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            base = 124.00;
        } else base = 0;

        if (isWeekend) {
            base = base + (base * 0.10);
        }
        return base;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public double getReservationTotal() {
        double nightly = getPricePerNight();
        return nightly * numberOfNights;
    }
    public void setReservationTotal(double reservationTotal) {
        this.reservationTotal = reservationTotal;
    }

}
