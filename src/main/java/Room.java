import java.util.ArrayList;

public class Room {
    private int numberOfBeds;
    double price;
    private boolean occupied;
    private boolean dirty;

    public Room(int numberOfBeds, double price, boolean occupied, boolean dirty){
        this.numberOfBeds = numberOfBeds;
        this.price =price;
        this.occupied = occupied;
        this.dirty = dirty;
    }

    public Room(){
        this.occupied = false;
    }

    public int getNumberOfBeds(){
        return numberOfBeds;
    }
    public void setNumberOfBeds(int numberOfBeds){
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied(){
        return occupied;
    }
    public boolean isDirty() {
        return dirty;
    }

    public boolean isAvailable(){
        if (isOccupied() || isDirty()) {
            return false;
        } else {
            return true;
        }
    }

    public void checkIn(){
            if (isAvailable()) {
                occupied = true;
                System.out.println("Checked-in successfully!");
            } else {
                System.out.println("Room is currently occupied.");
            }
    }

    public void checkOut(){
            if (occupied) {
                occupied = false;
                dirty = true;
                System.out.println("""
                        Checked-out successfully!
                        Thank you for staying at our hotel!""");
            } else {
                System.err.println("Can't check-out an empty room!");
            }
    }

    public void cleanRoom(){
            if (dirty) {
                dirty = false;
                System.out.println("Room has been cleaned.");
            } else {
                System.out.println("Room has been cleaned already!");
            }
    }
}

