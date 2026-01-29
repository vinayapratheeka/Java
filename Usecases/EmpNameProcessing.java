package Usecases;
 
public class EmpNameProcessing {
 
	public static void main(String[] args) {
		String[] names = {"Renu Sai", "Akil Kumar", "John Doe", "Meera"};
		
		for(int i = 0; i < names.length; i++) {
			String word = names[i];
			
			if(word.length() > 10) {
				System.out.println("Employee: " + word + " --> Long Name");
			} else if(!word.contains(" ")) {
				System.out.println("Employee: " + word + " --> Single Word");
			} else {
				System.out.println("Employee: " + word + " --> Normal Name");
			}
			
			String upperCase = word.toUpperCase();
			System.out.println("UPPER: " + upperCase);
			
			StringBuffer sb = new StringBuffer(word);
			sb.reverse();
			System.out.println("REVERSE: " + sb);
			
			StringBuilder sbb = new StringBuilder(word);
			sbb.append(" - Verified");
			System.out.println("APPENDED: " + sbb);
			
			System.out.println();
		}
	}
}