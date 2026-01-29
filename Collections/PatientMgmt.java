package Collections;
import java.util.*;

public class PatientMgmt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String>patients=new LinkedList();
		patients.add("Sai");
		patients.add(" Krishna");
		patients.add(" Deva"); 
		patients.addFirst("Emergency-Suresh");
		patients.addLast("Pooja");
		 
		System.out.println("Patient List:" + patients);
		 
		System.out.println("First Patient :" + patients.getFirst());
		  
		System.out.println("First Patient :" + patients.getLast());
		 
		System.out.println("Is Pooja present? " +patients.contains("Pooja"));
		
		System.out.println("Position of Deva: " +patients.indexOf("Deva"));
		 
		System.out.println("Treated Patient: " + patients.removeFirst());
		patients.remove("Pooja");
		 
		System.out.println("Total Remaining Patients: " + patients.size());
		 
		System.out.println("Updated Patient List :");
		 
		for(String patient : patients)
		{
			System.out.println(patient);
		 
		}

	}

}
