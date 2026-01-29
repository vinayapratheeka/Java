package Usecases;
class Account {
    int accNo;
    double balance;
    Account(int accNo, double balance) {
        this.accNo = accNo;
        this.balance = balance;
    }
    void display() {
        System.out.println(accNo + " " + balance);
    }
}
class SavingsAccount extends Account {
    SavingsAccount(int accNo, double balance) {
        super(accNo, balance);
    }
    void display() {
        super.display();
        System.out.println("Savings Account");
    }
}
class CurrentAccount extends Account {
    CurrentAccount(int accNo, double balance) {
        super(accNo, balance);
    }
    void display() {
        super.display();
        System.out.println("Current Account");
    }
}
public class AccountInh {
    public static void main(String[] args) {
        Account a1 = new SavingsAccount(101, 50000);
        Account a2 = new CurrentAccount(102, 100000);

        a1.display();
        a2.display();
    }
}
