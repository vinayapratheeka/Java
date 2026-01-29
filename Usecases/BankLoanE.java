package Usecases;
import java.util.*;

public class BankLoanE {

	public static void main(String[] args) {

		Integer age = 21;
		Integer c_score = 700;

		ArrayList<Double> income = new ArrayList<>();
		income.add(20000.00);
		income.add(35000.00);

		double total = 0.0;

		for (Double inc : income) {
			total += inc;
		}

		double averageIncome = total / income.size();

		if (age >= 21 && c_score >= 700 && averageIncome >= 30000.00) {
			System.out.println("Loan Approved");
		} else {
			System.out.println("Loan Rejected");
		}
	}

}
