package Collections;
import java.util.*;
class Patient {
    int id;
    String name;
    Patient(int id, String name) {
        this.id = id;
        this.name = name;
    }
    public int hashCode() {
        return id;  
    }
    public boolean equals(Object obj) {
        Patient p = (Patient) obj;
        return this.id == p.id;
    }
   // public String toString() {
    //    return id + " - " + name;
   // }
}
public class PatientRegistrationU {
	public static void main(String[] args) {
		HashSet<Patient> patients = new HashSet<>();

		Patient p1 = new Patient(101, "Ravi");
		if (patients.add(p1)) {
			System.out.println("Patient added");
		} else {
			System.out.println("Already registered");
		}

		Patient p2 = new Patient(102, "Sita");
		if (patients.add(p2)) {
			System.out.println("Patient added");
		} else {
			System.out.println("Already registered");
		}

		Patient p3 = new Patient(101, "Ravi");
		if (patients.add(p3)) {
			System.out.println("Patient added");
		} else {
		    System.out.println("Already registered");
		}

		System.out.println("\nUnique Registered Patients:");
		for (Patient p : patients) {
		    System.out.println(p);
		}
	}	
}
