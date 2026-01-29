package Usecases;

import java.util.ArrayList;

public class BankLoan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer age = 21;
		Integer c_score = 700;
		ArrayList<Double> income = new ArrayList();
		income.add(20000.00);
		double inc = income.get(0);
		//System.out.println("");
		if(age.compareTo(21)>=0 && c_score.compareTo(700)>=0 && Double.compare(inc,30000.0)>=0) {
			System.out.print("Loan Approved");
        } else {
            System.out.print("Loan Rejected");
		}
	}

}
