package Collections;
import java.util.*;

public class PatientReg1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Set<Integer> ids = new HashSet<>();

        ids.add(201);
        ids.add(202);
        ids.add(203);
        ids.add(204);

        System.out.println("Please enter patient ID for registration:");
        int id = sc.nextInt();

        if (ids.contains(id)) {
            System.out.println("This patient ID already exists in the system.");
        } else {
            ids.add(id);
            System.out.println("New patient registration completed.");
        }

        System.out.println("Number of registered patients: " + ids.size());

        System.out.println("Registered Patient IDs:");
        for (Integer i : ids) {
            System.out.println("Patient ID " + i);
        }

        sc.close();
    }
}