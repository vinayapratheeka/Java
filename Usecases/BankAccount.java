package Usecases;
class BackAcc{
	private int deposit;
	private int withdrawal;
	
	public void setDeposit(int deposit) {
		this.deposit= deposit;

	}
	public void setWithdrawal(int withdrawal) {
		this.withdrawal= withdrawal;

	}
	public int getDeposit() {
		return deposit;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
}

public class BankAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BackAcc a = new BackAcc();
		a.setDeposit(20000);
		a.setWithdrawal(10000);
		System.out.println("Deposited amount: "+a.getDeposit());
		System.out.println("Withdrawal Amount: "+a.getWithdrawal());

	}

}
