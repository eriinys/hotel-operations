public class Room {
    private int numberOfBeds;
    double price;
    private boolean occupied;
    private boolean dirty;

    public int getNumberOfBeds(){
        return numberOfBeds;
    }
    public void setNumberOfBeds(int numberOfBeds){
        this.numberOfBeds = numberOfBeds;
    }

    public double getPrice() {
        Reservation reservation = new Reservation();
        price = reservation.price;
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
}
