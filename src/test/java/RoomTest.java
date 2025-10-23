import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    //checkIn() // room should be occupied and dirty
    //checkout()
    //cleanroom()

    @Test
    public void checkIn_shouldBeOccupied(){
       //Arrange
        Room room = new Room();

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isOccupied());
    }

    @Test
    public void checkIn_shouldBeDirty(){
        //Arrange
        Room room = new Room();

        //Act
        room.checkIn();

        //Assert
        assertTrue(room.isDirty());
    }

    @Test
    public void checkIn_shouldNotCheckInIfOccupied(){
        //Arrange
        Room room = new Room();
        room.isOccupied(true);
        String expected = "Room is currently occupied.";

        //Act
        String actual = room.checkIn();

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    public void checkOut_shouldNotBeOccupied(){
        //Arrange
        Room room = new Room();
        room.checkIn();

        //Act
        room.checkOut();
        
        //Assert
        assertFalse(room.isOccupied());
    }

    @Test
    public void cleanRoom(){
        //Arrange
        Room room = new Room();
        room.checkIn();
        room.checkOut();

        //Act
        room.cleanRoom();

        //Assert
        assertFalse(room.isDirty());
    }

    //How many tests should you write?
    //Should you be able to check in a room, if it is already occupied?
    //What if it is dirty?
    //Should housekeeping be able to clean the room if it is occupied

}