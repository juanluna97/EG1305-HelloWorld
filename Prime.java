//Juan Luna
//Objected-Oriented Programming
//Assignment #3 - DaysInMonth
//28 February 2017
/* The purpose of this code is make the user input a number and tell them the 
 * prime numbers. */
import java.util.Scanner; 
public class Prime 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner (System.in);
		
		int counter=0;
        System.out.println("Enter a number:");
        int UserNumber = input.nextInt();
         
        for(int i=1; i < UserNumber; i++)
        {
                 
        	boolean isPrime = true;
                 
            for(int j=2; j < i ; j++)
            {           
            	if(i % j == 0)
            	{
            		isPrime = false;
                     break;
                }
             }
                 if(isPrime)
                 {
                	 System.out.print(i + " ");
                	 counter++;
                 }
         }
        System.out.println("\nThere are a total of " + counter + 
        				   " prime numbers.");
     }
}