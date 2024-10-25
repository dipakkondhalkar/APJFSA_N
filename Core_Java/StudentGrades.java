package core_java;

public class StudentGrades {
	 public static void main(String[] args) {

	        int marks = 92;
	       
	        if (marks > 90) {
	        	System.out.println("The student's grade is: A" );
	        } else if (marks >= 80 && marks <= 90) {
	        	System.out.println("The student's grade is: B" );
	        } else if (marks >= 70 && marks < 80) {
	        	System.out.println("The student's grade is: C" );
	        } else if (marks >= 60 && marks < 70) {
	        	System.out.println("The student's grade is: D" );
	        } else {
	        	System.out.println("The student's grade is: F" );
	        }

	    
}
}
/*Output:
 The student's grade is: A
 */