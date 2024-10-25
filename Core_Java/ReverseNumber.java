package core_java;
import java.util.*;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the 3 digit number Number:");
		int number=sc.nextInt();

		int H = number/100;         //To get hundred place
		int T = (number/10) % 10;   //To get Tens Place
		int U = number%10;          //To get Unit Place

		int Reverse= (U*100) + (T*10) + H;  //Creating variable to store reversed integers
		System.out.println("The Reversed Number is :"+ Reverse);
	}

}

/* Enter the 3 digit number Number
   123
   The Reversed Number is :321
 */