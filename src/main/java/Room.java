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
}
