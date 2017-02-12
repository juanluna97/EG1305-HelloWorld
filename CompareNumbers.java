//Juan Luna
//Objected-Oriented Programming
//Assignment #3 - CompareNumbers
//10 February 2017
/*The purpose of this code is to ask for three integers and perform various tasks with
 * them, such as adding, multiplying, average, and using logical operators to classify
 * the largest from the smallest */
import java.util.Scanner;

public class CompareNumbers 
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in);

		try
		{
			// Asking the user for three integers
			System.out.print("Enter the first integer: ");
			int a = input.nextInt();
			System.out.print("Enter the second integer: ");
			int b = input.nextInt();
			System.out.print("Enter the third integer: ");
			int c = input.nextInt();
			System.out.println("For the number " + a + ", " + b + " and " + c);
			
			//If compares which number is the largest
			if (a > b && a > c)
			{
				System.out.println( "Largest is " + a );
			}
			else if (b > a && b > c)
			{
				System.out.println( "Largest is " + b );
			}
			else
			{
				System.out.println( "Largest is " + c );
			}
			//If compares which number is the smallest
			if (a < b && a < c)
			{
				System.out.println("Smallest is " + a);
			}
			else if (b < c && b < c)
			{
				System.out.println( "Smallest is " + b );
			}
			else
			{
				System.out.println("Smallest is " + c);
			}
			//Performs a series of calculations
			System.out.println("Sum is " + (a + b + c));
			System.out.println("Product is " + (a*b*c));
			System.out.println("The average is " + (a+b+c)/3);
		}
		finally
		{
			input.close();
		}
	}
}

