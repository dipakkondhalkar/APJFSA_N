package Javaprogram;

public class Employee {
    // Member variables
    private int empId;
    private String empName;
    private int empAge;
    private double empSalary;

    // Constructor
    public Employee(int empId, String empName, int empAge, double empSalary) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // Getter methods
    public int getEmpId() {
        return empId;
    }

    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public double getEmpSalary() {
        return empSalary;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Age: " + empAge);
        System.out.println("Employee Salary: " + empSalary);
        System.out.println(); // Added for better formatting
    }

    public static void main(String[] args) {
        // Creating and displaying multiple Employee objects
        Employee employee1 = new Employee(1, "Aditi Zanje", 24, 50000.00);
        Employee employee2 = new Employee(2, "Anuja Sakunkhe", 26, 54000.00);
        
        System.out.println("Employee Details:");
        employee1.displayEmployeeDetails();
        employee2.displayEmployeeDetails();
    }
}
/*
 * Employee Details:
Employee ID: 1
Employee Name: Aditi Zanje
Employee Age: 24
Employee Salary: 50000.0

Employee ID: 2
Employee Name: Anuja Sakunkhe
Employee Age: 26
Employee Salary: 54000.0

*/
