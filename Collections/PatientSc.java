package Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class PatientSc {
    public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);
        LinkedList<String> patients = new LinkedList<>();

        int choice;
        patients.add("Sai");
        patients.add("Krishna");
        patients.add("Deva");

        do {
            System.out.println("\n--- Hospital Patient Queue ---");
            System.out.println("1. Add Patient");
            System.out.println("2. Add Emergency Patient");
            System.out.println("3. Treat Patient");
            System.out.println("4. View All Patients");
            System.out.println("5. Check First Patient");
            System.out.println("6. Check Last Patient");
            System.out.println("7. Search Patient");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {

                case 1:
                    System.out.print("Enter patient name: ");
                    String name = sc.nextLine();
                    patients.add(name);
                    System.out.println("Patient added.");
                    break;

                case 2:
                    System.out.print("Enter emergency patient name: ");
                    String emergency = sc.nextLine();
                    patients.addFirst(emergency);
                    System.out.println("Emergency patient added.");
                    break;

                case 3:
                    if (!patients.isEmpty()) {
                        System.out.println("Treated patient: " + patients.removeFirst());
                    } else {
                        System.out.println("No patients in queue.");
                    }
                    break;

                case 4:
                    System.out.println("Patient List:");
                    for (String p : patients) {
                        System.out.println(p);
                    }
                    break;

                case 5:
                    if (!patients.isEmpty())
                        System.out.println("First patient: " + patients.getFirst());
                    else
                        System.out.println("Queue is empty.");
                    break;

                case 6:
                    if (!patients.isEmpty())
                        System.out.println("Last patient: " + patients.getLast());
                    else
                        System.out.println("Queue is empty.");
                    break;

                case 7:
                    System.out.print("Enter patient name to search: ");
                    String search = sc.nextLine();
                    System.out.println("Is patient present? " + patients.contains(search));
                    break;

                case 0:
                    System.out.println("Exit the program...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 0);

        sc.close();
    }
}

