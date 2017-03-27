
public class Account {

	double balance;
	double annualInterestRate;
	double monthlyInterestRate;
	double totalDeposits;
	double totalWithdraws;
	double totalInterest;

	public Account(double startBalance, double annual_Interest_Rate) {
		balance = startBalance;
		annualInterestRate = annual_Interest_Rate;
	}

	public void setAnnualInterestRate(double annual_Interest_Rate) {
		monthlyInterestRate = annualInterestRate / 12;
	}

	public void setDeposit(double amount) {
		balance += amount;
		totalDeposits += amount;
	}

	public void setWithdraw(double amount) {
		balance -= amount;
		totalWithdraws += amount;
	}

	public void calculateMonthlyInterest() {
		totalInterest = totalInterest + balance * monthlyInterestRate;
		balance = balance + balance * monthlyInterestRate;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public double getMonthlyInterestRate() {
		return monthlyInterestRate;
	}

	public double getTotalDeposits() {
		return totalDeposits;
	}

	public double getTotalWithdraws() {
		return totalWithdraws;
	}

	public double getTotalnterest() {
		return totalInterest;
	}

	public void displayData() {
		balance = Math.round(balance * 100.0) / 100.0;
		totalInterest = Math.round(totalInterest * 100.0) / 100.0;
		System.out.println();
		System.out.println("The ending balance is: $" + balance);
		System.out.println("Total amount of deposits: $" + totalDeposits);
		System.out.println("Total amount of withdraws: $" + totalWithdraws);
		System.out.println("Total interest earned: $" + totalInterest);
	}
}
