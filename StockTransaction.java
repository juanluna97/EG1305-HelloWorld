//Juan Luna
//Object-Oriented Programming
//Assignment 1 - StockTransaction
//27 January 2017
import java.text.DecimalFormat;
public class StockTransaction {
	public static void main(String[]args)
	{
		DecimalFormat df = new DecimalFormat ("0.00");
		double MoneyPaid = 1000 * 32.87;
		final double COMISSION_RATE = 0.02;
		double MoneyReceived = 1000 * 33.92;
		double Profit = (MoneyReceived - (((MoneyReceived*COMISSION_RATE))+(MoneyPaid*COMISSION_RATE)+MoneyPaid));
		System.out.println("The amount of money Joe paid was $" + MoneyPaid);
		System.out.println("The amount of money the stockbroker received was $" + (COMISSION_RATE * MoneyPaid));
		System.out.println("The amount of money Joe received after selling his stock was $" + MoneyReceived);
		System.out.println("The amount of money the stockbroker received after Joe sold the stock was $" + (COMISSION_RATE * MoneyReceived));
		System.out.println("Joe's profit was $" + df.format(Profit));
	}
}
