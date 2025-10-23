import org.junit.jupiter.api.Test;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    //Create an EmployeeTest class to test the punchIn and punchOut methods of
    //the Employee class. Verify that when an employee punches out, their time is
    //calculated correctly.
    //punchIn(double time)
    //punchOut(double time)


    @Test
    public void punchTimeCard_shouldBePunchedIn() {

        //Arrange
        Employee employee = new Employee();
        boolean punchingIn = true;
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        double time = Double.parseDouble(timeNow.format(formatter).toString().replace(":" , "."));

        //Act
        employee.punchTimeCard(punchingIn,time);

        //Assert
        assertTrue(employee.isPunchedIn());
    }

    @Test
    public void punchTimeCard_shouldBePunchedOut() {

        //Arrange
        Employee employee = new Employee();
        boolean punchingIn = false;
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        double time = Double.parseDouble(timeNow.format(formatter).toString().replace(":" , "."));

        //Act
        employee.punchTimeCard(punchingIn,time);

        //Assert
        assertFalse(employee.isPunchedIn());
    }

    @Test
    public void punchTimeCard_shouldDisplayCorrectTime() {

        //Arrange
        Employee employee = new Employee();
        boolean punchingIn = true;
        LocalTime timeNow = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        double time = Double.parseDouble(timeNow.format(formatter).toString().replace(":" , "."));
        String expected = String.format("Punched in successfully at %.2f", time);

        //Act
        String actual = employee.punchTimeCard(punchingIn,time);

        //Assert
        assertEquals(expected, actual);
    }

}