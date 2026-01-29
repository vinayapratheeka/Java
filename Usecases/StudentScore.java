package Usecases;
import java.util.Scanner;

public class StudentScore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Student: ");
		String name = sc.next();
		System.out.print("Enter marks in English: ");
		int marks1 = sc.nextInt();
		System.out.print("Enter marks in Maths: ");
		int marks2 = sc.nextInt();
		int total = marks1 + marks2;
		float percent = (total/200.0f)*100;
		String grade;
		if(percent >= 90)
			grade = "A";
		else if(percent >= 75)
			grade = "B";
		else if(percent >= 50)
			grade = "C";
		else
			grade = "Fail";
		
		//StudentRecord sr = new StudentRecord();
		//sr = null;
		
		System.out.println("Student: " + name);
        System.out.println("English: " + marks1);
        System.out.println("Maths: " + marks2);
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percent + "%");
        System.out.println("Grade: " + grade);

        sc.close();

}
}

/*class StudentRecord{
	StudentRecord(){}
}*/
