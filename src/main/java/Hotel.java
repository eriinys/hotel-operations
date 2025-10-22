public class Hotel {
    private String name;
    private int numberOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numberOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public Hotel(String name, int numberOfSuites, int numberOfRooms) {
        this.name = name;
        this.numberOfSuites = numberOfSuites;
        this.numberOfRooms = numberOfRooms;
    }


    public String getName() {
        return name;
    }

    public int getNumberOfSuites() {
        return numberOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }

    public int getAvailableSuites(){
        int availableSuites = numberOfSuites - bookedSuites;
        return availableSuites;
    }

    public int getAvailableRooms(){
        int availableRooms = numberOfRooms - bookedBasicRooms;
        return availableRooms;
    }

    public boolean bookRoom(int numOfRooms, boolean isSuite){
        if (isSuite) {
            if (getAvailableSuites() >= numOfRooms) {
                System.out.printf("%d suite room(s) successfully booked! %n", numOfRooms);
                bookedSuites = bookedSuites + numOfRooms;
                return true;
            } else System.out.println("No suite room of that number is currently available today.");
            return false;
        } else if (!isSuite && getAvailableRooms() >= numOfRooms){
            System.out.printf("%d basic room(s) successfully booked. %n", numOfRooms);
            bookedBasicRooms = bookedBasicRooms + numOfRooms;
            return true;
        } else {
            System.out.println("No room of that number is currently available today.");
            return false;
        }
    }
}
