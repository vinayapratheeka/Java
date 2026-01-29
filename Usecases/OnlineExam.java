package Usecases;
import java.util.*;

public class OnlineExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> score = new HashMap();
		// Autoboxing: int -> Integer
		score.put("Maths", 80);
		score.put("Science", 75);
	    score.put("English", 85);
		int total = 0;
		// Unboxing for calculation
		for (Integer sc : score.values()) {
		            total += sc;
		}
		double average = total / (double) score.size();
		System.out.println("Average Score: " + average);
	}
}
