import java.util.Scanner; 
public class TestAccount {
	    public static void main(String[] args)
	    {
	        double startBalance; 
	        double annual_Interest_Rate; 
	        int months; 
	        double deposit_Amount; 
	        double withdraw_Amount; 

	        Scanner input = new Scanner(System.in); 

	        System.out.print("Enter starting balance: $"); 
	        startBalance = input.nextDouble(); 

	        System.out.print("Enter annual interest rate: "); 
	        annual_Interest_Rate = input.nextDouble(); 

	        System.out.print("Enter the number of months: ");
	        months = input.nextInt(); 

	        Account sa = new
	        Account(startBalance, annual_Interest_Rate); 

	        sa.setAnnualInterestRate(annual_Interest_Rate);

	        for (int i = 0; i < months; i++)
	        {

	            System.out.print("Enter amount to deposit for the month " + (i+1) + ":$"); 
	            deposit_Amount = input.nextDouble(); 


	            sa.setDeposit(deposit_Amount); 


	            System.out.print("Enter amount to withdraw for the month " + (i+1) + ":$"); 
	            withdraw_Amount = input.nextDouble(); 


	            sa.setWithdraw(withdraw_Amount); 


	            sa.calculateMonthlyInterest();

	        }
	        sa.displayData(); 
	    }
	}
