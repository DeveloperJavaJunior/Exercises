import java.sql.Date;

public class AccountClass {

	public static void main(String[] args) {

		Account account = new Account(1122, 20000.00, 0.045);
		account.withdraw = (2500.00);
		account.deposit = (3000.00);

		System.out.println(" The balance is " + account.balance);
		System.out.println(" The monthly interest rate is " + account.getMonthlyInterestRate());
		System.out.println(" The account created is " + account.dateCreated);

	}

}

class Account {

	int id;
	double balance;
	double annualInterestRate;
	Date dateCreated;
	double deposit;
	double withdraw;

	Account() {

		id = 0;
		balance = 0.0;
		annualInterestRate = 0.0;
	}

	Account(int newId, double newBalance, double newAnnualInterestRate) {

		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
	}

	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	public void setDateCreated(Date newDateCreated) {
		dateCreated = newDateCreated;
	}

	double getMonthlyInterestRate() {
		return annualInterestRate / 12;
	}

	double withdraw(double amount) {
		return balance - amount;

	}

	double deposit(double amount) {
		return balance + amount;

	}
}