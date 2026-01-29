package Usecases;
import java.util.*;

public class OnlineScoreSc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Integer> score = new HashMap<>();

		System.out.println("Enter Maths score:");
		score.put("Maths", sc.nextInt());   // autoboxing

		System.out.println("Enter Science score:");
		score.put("Science", sc.nextInt()); // autoboxing

		System.out.println("Enter English score:");
		score.put("English", sc.nextInt()); // autoboxing

		int total = 0;

		// Unboxing
		for (Integer sco : score.values()) {
			total += sco;
		}

		double average = total / (double) score.size();

		System.out.println("Average Score: " + average);

		sc.close();
	}
}
