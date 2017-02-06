//Juan Luna
//Objected-Oriented Programming
//Assignment #2 - MilesPerGallon
//5 February 2017
/*The purpose of this code is to calculate Miles-per-gas when the user is prompt the 
 *miles and gallons by using a scanner function*/

import java.util.Scanner;   

public class MilesPerGallon {
	
	public static void main (String [] args){
		
	Scanner input = new Scanner(System.in);
		
	try{
			
	//Asking for the information and storing it
	System.out.print("Enter the miles driven: ");
	double miles = input.nextDouble();
			
	System.out.print("Enter the gallons of fuels used: ");
	double gallons = input.nextDouble();
			
	//The calculations are done here
	double MilesPerGas = miles / gallons;	
			
	//Printing results
	System.out.print("The miles-per-gallon is " + MilesPerGas);}
		
	//Closing the scanner function
	finally{
	input.close();}
	}
}
