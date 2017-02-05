//Juan Luna
//Objected-Oriented Programming
//Assignment #2 - CountMoney
//5 February 2017
/*The purpose of this code is to ask the user for a quantity of money and divide that
 *money into their subsequent divisions of coins and dollars by using a scanner function*/
import java.util.Scanner;
public class CountMoney {
	public static void main (String [] args){
		Scanner input = new Scanner(System.in);
		try{
		//Asking the user for the money in integers
		System.out.println("Enter an amount in integer, for example 1156");
		System.out.print("for 11 dollars and 56 cents: ");
		int num = input.nextInt();
		System.out.println("Your amount of " + num + " consists of");
		//Calculations of the conversion
		int cents = num % 100; 
		int dollars = (num - cents) / 100;
		int quarters = cents / 25;
		int dimes = (cents - (25*quarters)) / 10;
		int nickels = (cents - ((25*quarters)+(10*dimes))) / 5;
		int pennies = (cents - ((25*quarters)+(10*dimes)+(5*nickels)));
		//Printing results
		System.out.println(dollars + " dollars");
		System.out.println(quarters + " quarters");
		System.out.println(dimes + " dimes");
		System.out.println(nickels + " nickels");
		System.out.println(pennies + " pennies");}
		//Closing the scanner function
		finally{
			input.close();}
	}
}
