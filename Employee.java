
// Employee Bean Class
// Represents an Employee with attributes EmpId, EmpName, EmpAge, and EmpSalary.
 
public class Employee {

    // Private fields for employee details
    private int empId; // Unique Employee ID
    private String empName; // Employee Name
    private int empAge; // Employee Age
    private double empSalary; // Employee Salary

    
    //Default Constructor
    
    public Employee() {
        // Initialize default values
        this.empId = 0;
        this.empName = "";
        this.empAge = 0;
        this.empSalary = 0.0;
    }

    //Parameterized Constructor,  empId   Employee Id,empName Employee Name,empAge  Employee Age,empSalary Employee Salary
     
    public Employee(int empId, String empName, int empAge, double empSalary) {
        // Initialize employee details
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }

    // Getters and Setters for employee details

   //Gets Employee ID, empId
    
    public int getEmpId() {
        return empId;
    }


     // Sets Employee ID
     // @param empId Employee ID
     
    public void setEmpId(int empId) {
        this.empId = empId;
    }

    // Gets Employee Name, empname
    
    public String getEmpName() {
        return empName;
    }

    // Sets Employee Name,empName Employee Name
   
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    // Gets Employee Age,empAge
     
    public int getEmpAge() {
        return empAge;
    }

    //Sets Employee Age,empAge Employee Age
     
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    
     // Gets Employee Salary, empSalary
     
    public double getEmpSalary() {
        return empSalary;
    }

    // Sets Employee Salary, empSalary Employee Salary
    
    public void setEmpSalary(double empSalary) {
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        // Return string representation of Employee object
        return "Employee [empId=" + empId + ", empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
    }

    public static void main(String[] args) {
        // Create Employee object using parameterized constructor
        Employee employee = new Employee(1, "John Doe", 30, 50000.0);
        
        // Access employee details using getter methods
        System.out.println("Employee ID: " + employee.getEmpId());
        System.out.println("Employee Name: " + employee.getEmpName());
        System.out.println("Employee Age: " + employee.getEmpAge());
        System.out.println("Employee Salary: " + employee.getEmpSalary());
        
        // Modify employee details using setter methods
        employee.setEmpName("John Smith");
        employee.setEmpSalary(60000.0);
        
        // Print updated employee details
        System.out.println(employee.toString());
    }
}
/*
 Ouptut:
Employee ID: 1
Employee Name: John Doe
Employee Age: 30
Employee Salary: 50000.0
Employee [empId=1, empName=John Smith, empAge=30, empSalary=60000.0]
 */