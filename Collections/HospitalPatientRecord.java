package Collections;
import java.util.*;
public class HospitalPatientRecord {

    private int patientId;
    private String name;
    private int age;
    static Map<Integer, HospitalPatientRecord> patients = new TreeMap<>();

    public HospitalPatientRecord(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    //adding
    public static void addPatient(HospitalPatientRecord patient) {
        if (patients.containsKey(patient.patientId)) {
            System.out.println("Patient ID " + patient.patientId + " already exists");
        } else {
            patients.put(patient.patientId, patient);
            System.out.println("Patient added: " + patient);
        }
    }

    //updating
    public static void updatePatient(int id, String newName, int newAge) {
        if (patients.containsKey(id)) {
            HospitalPatientRecord p = patients.get(id);
            p.name = newName;
            p.age = newAge;
            System.out.println("Patient updated: " + p);
        } else {
            System.out.println("Patient ID " + id + " not found");
        }
    }

    //retrieving
    public static void getPatient(int id) {
        HospitalPatientRecord p = patients.get(id);
        if (p != null) {
            System.out.println("Patient found: " + p);
        } else {
            System.out.println("Patient ID " + id + " not found");
        }
    }

    //removing
    public static void removePatient(int id) {
        if (patients.remove(id) != null) {
            System.out.println("Patient ID " + id + " removed");
        } else {
            System.out.println("Patient ID " + id + " not found");
        }
    }

    //printing all
    public static void listAllPatients() {
        if (patients.isEmpty()) {
            System.out.println("No patients registered");
        } else {
            System.out.println("All Registered Patients:");
            for (HospitalPatientRecord p : patients.values()) {
                System.out.println(p);
            }
        }
    }

    //checking 
    public static void checkPatient(int id) {
        System.out.println("Patient ID " + id + " exists? " + patients.containsKey(id));
    }

    //count
    public static void countPatients() {
        System.out.println("Total Patients: " + patients.size());
    }

    // clr
    public static void clearSystem() {
        patients.clear();
        System.out.println("Hospital record cleared");
    }

  /*  @Override
    public String toString() {
        return "Patient [ID=" + patientId + ", Name=" + name + ", Age=" + age + "]";
    }*/

    public static void main(String[] args) {

        HospitalPatientRecord p1 = new HospitalPatientRecord(101, "Ravi", 30);
        HospitalPatientRecord p2 = new HospitalPatientRecord(102, "Ram", 28);
        HospitalPatientRecord p3 = new HospitalPatientRecord(103, "Ramesh", 40);
        HospitalPatientRecord p4 = new HospitalPatientRecord(103, "Duplicate", 50);

        addPatient(p1);
        addPatient(p2);
        addPatient(p3);
        addPatient(p4);     // dup

        System.out.println();

        listAllPatients();

        System.out.println();

        getPatient(102);
        checkPatient(105);

        System.out.println();

        updatePatient(102, "Ram Kumar", 29);

        System.out.println();

        removePatient(101);

        System.out.println();

        countPatients();

        System.out.println();

        clearSystem();

        countPatients();
    }
}