package Usecases;
import java.util.*;
public class ATMCard_Excep {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int orgPin = 1234;
		try {		
			System.out.println("Enter your Pin :");
			int pin = sc.nextInt();
		  if(pin == orgPin) {		  
			  System.out.println("Pin Got Matched ");
		  }else {
			  throw new Exception("try with correct pin");		  
		  }
		}catch(Exception e) {
			System.out.println("Wrong Input  Please try Again" + e.getMessage());
			sc.next();
		}
		finally{
			System.out.println("Logged Completed");
		}
	}
}
