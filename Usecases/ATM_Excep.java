package Usecases;
import java.util.Scanner;

public class ATM_Excep {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int originalpin = 1234;
		try {
			System.out.println("Enter the pin:");
			int pin = sc.nextInt();
			if(pin != originalpin) {
				System.out.println("Wrong pin");
			}
			System.out.println("Proceed");
		}
		catch(Exception e) {
			System.out.println("Retry with correct pin");
		}
		finally {
			System.out.println("Logged out");
		}

	}

}
