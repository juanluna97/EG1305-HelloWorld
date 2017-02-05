//Juan Luna
//Object-Oriented Programming
//Assignment 1 - Drink
//27 January 2017
import java.text.DecimalFormat;
public class Drink {
	public static void main(String[]args)
	{
		DecimalFormat df = new DecimalFormat ("0");
		double costumers = 12467;
		double amount_purchased= costumers * .14;
		double citrus= costumers * .64;
		/*this is not correct as 64 percent of energy drink users prefer citrus not 
		64 percent of the customers, should be .14 * .64 * customers. 
		*/
		
		System.out.println("The number of costumers that purchase one or more energy drinks per week is " + df.format(amount_purchased));
		System.out.println("The number of costumers that in the survey who prefer citrus flavored energy drinks is " + df.format(citrus));
	}

}
