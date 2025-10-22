import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private boolean punchedIn;

    public Employee(int employeeId, String name, String department, double payRate, double hoursWorked, boolean punchedIn) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.punchedIn = punchedIn;
    }

    public Employee(){}

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double totalPay = payRate * hoursWorked;
        return totalPay;
    }

    public double getRegularHours() {
        double regularHours = 0;
        if (hoursWorked <= 40) {
            regularHours = hoursWorked;
        }
        return regularHours;
    }

    public double getOvertimeHours(){
        double overtimeHours = 0;
        if (hoursWorked > 40) {
            overtimeHours = 40 - hoursWorked;
        }
        return overtimeHours;
    }

    public boolean isPunchedIn() {
        return punchedIn;
    }

    public void setPunchedIn(boolean punchedIn) {
        this.punchedIn = punchedIn;
    }

    public void punchTimeCard(boolean punchingIn, double punchTime) {

        if (punchingIn == true && !punchedIn) {
            punchedIn = true;
            System.out.printf("Punched in successfully at %.2f%n%n", punchTime);
        } else if (!punchingIn && punchedIn) {
            punchedIn = false;
            System.out.printf("Punched out successfully at %.2f%n%n", punchTime);
        } else {
            System.err.println("Invalid action.");
        }
    }

    public void punchTimeCard(boolean punchingIn, LocalTime punchTime) {

        if (punchingIn == true && !punchedIn) {
            punchedIn = true;
            System.out.printf("Punched in successfully at %.2f%n%n", punchTime);
        } else if (!punchingIn && punchedIn) {
            punchedIn = false;
            System.out.printf("Punched out successfully at %.2f%n%n", punchTime);
        } else {
            System.err.println("Invalid action.");
        }
    }
}