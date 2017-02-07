//Juan Luna
//Objected-Oriented Programming
//Assignment #2 - SumsDigits
//5 February 2017
/*The purpose of this code is to prompt the user for an integer number between 0 - 1000
 * and printing the results of the sum of digits in the number*/

import java.util.Scanner;
public class SumDigits{
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in); 
		
		try{
			
		//Asking the user for information
		System.out.print(" Enter an integer between 0 and 1000 : ");
		int num = input.nextInt();
			
		//Calcuations are done here
		int ones = num % 10;
		int tens = (num / 10) % 10 ;
		int hundreds = (num / 100) % 10;
		int thousands = (num / 1000) %10;
    		int answer = ones + tens + hundreds + thousands;
    		
		//Printing results
    		System.out.print(" The sum of the digit is " + answer);}
		
		//Closing the scanner function
		finally{
		input.close();}
	}
}
