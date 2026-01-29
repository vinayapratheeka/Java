package Collections;
import java.util.HashSet;

public class PatientReg {
	public static void main(String[] args) {
        HashSet<Integer> patientIds = new HashSet<>();

        registerPatient(patientIds, 101);
        registerPatient(patientIds, 102);
        registerPatient(patientIds, 101); // duplicate
        registerPatient(patientIds, 103);

        System.out.println("\nUnique registered patient IDs:");
        System.out.println(patientIds);
    }
    public static void registerPatient(HashSet<Integer> set, int id) {
        if (set.contains(id)) {
            System.out.println("ID " + id + " is already registered");
        } else {
            set.add(id);
            System.out.println("Patient with ID " + id + " added to the system");
        }
    }
}