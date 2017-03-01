//Juan Luna
//Objected-Oriented Programming
//Assignment #3 - DaysInMonth
//28 February 2017
/* The purpose of this code is make the user input a number and tell them the 
 * Mersenne prime numbers. */
import java.util.Scanner;
public class MersennePrime 
{
	public static void main (String[] args)
	{
		int counter=0;
		Scanner input = new Scanner(System.in);
	    System.out.println("Enter a number. The program will print all the "
	    		         + "Mersenne prime numbers smaller than this number.");
		    
		int UserNumber = input.nextInt();
	    for (int i =2;i<=UserNumber;i++)
	    {
	    	if (isPrime(i) && isPrime((int) (Math.pow(2, i)-1)))
		    {
		   	  if (UserNumber > Math.pow(2, i)-1)
		   	  {
		      System.out.print(+ (int) (Math.pow(2, i)-1) + "\t");
		   	  counter++;
		   	  }
	        }
	    }
	    System.out.println("\nThere are a total of " + counter + " Mersenne prime numbers.");
	 }
		 
	public static boolean isPrime(int num)
	{	
		for (int i = 2;i<=Math.sqrt(num);i++)
	    {
			if (num%i == 0)
		    return false;
	    }
		    return true;
	}
}
