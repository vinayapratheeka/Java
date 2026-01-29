package vinaya;
import java.util.Scanner;

public class ATM {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
	        double balance = 5000;
	        int choice;
	        int pin = 0;
	        boolean pinSet = false;

	  
	        System.out.println("=================================");
	        System.out.println("      WELCOME TO ATM");
	        System.out.println("=================================");
	        System.out.println("Please insert your card...");
	        System.out.println("Card inserted successfully");

	     
	        System.out.println("\nSelect Language:");
	        System.out.println("1. English");
	        System.out.println("2. Hindi");
	        System.out.print("Enter choice: ");
	        sc.nextInt();

	       
	        if (!pinSet) {
	            System.out.print("\nCreate your 4-digit PIN: ");
	            pin = sc.nextInt();
	            pinSet = true;
	            System.out.println("PIN created successfully");
	        }

	       
	        int enteredPin;
	        do {
	            System.out.print("\nEnter your PIN: ");
	            enteredPin = sc.nextInt();
	            if (enteredPin != pin) {
	                System.out.println("Incorrect PIN Try again.");
	            }
	        } while (enteredPin != pin);

	       
	        do {
	            System.out.println("\n--------- ATM MENU ---------");
	            System.out.println("1. Balance Enquiry");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            System.out.print("Select option: ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.println("Available Balance: Rs" + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter deposit amount: Rs");
	                    double deposit = sc.nextDouble();
	                    balance += deposit;
	                    System.out.println("Amount deposited successfully ");
	                    break;

	                case 3:
	                    System.out.print("Enter withdrawal amount: Rs.");
	                    double withdraw = sc.nextDouble();
	                    if (withdraw <= balance) {
	                        balance -= withdraw;
	                        System.out.println("Please collect your cash");
	                    } else {
	                        System.out.println("Insufficient balance ");
	                    }
	                    break;

	                case 4:
	                    System.out.println("\nTransaction completed.");
	                    System.out.println("Please remove your card.");
	                    System.out.println("Thank you for using ATM ");
	                    break;

	                default:
	                    System.out.println("Invalid selection");
	            }

	        } while (choice != 4);

	    }
		

	}


