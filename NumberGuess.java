//Juan Luna
//Objected-Oriented Programming
//Assignment #3 - DaysInMonth
//10 February 2017
/* The purpose of this code is make the user guess a number between 1 - 100. This 
 * is done by performing a series of if within a loop.*/
import java.util.Random;
import java.util.Scanner;

public class NumberGuess 
{
	public static void main (String []args)
	{
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int ComputerNum = rand.nextInt(99)+1; 
		int win = 0;
		
		System.out.println("Enter a number between 1 and 100");
		
		while (win == 0)
		{
			int number = input.nextInt();
			
			if (number == ComputerNum)
			{
				System.out.println("You guessed it right");
				win++;
			}
			if (number > ComputerNum)
			{
				System.out.println("Guess Lower");
			}
			if (number < ComputerNum)
			{
				System.out.println("Guess Higher");
			}
		}
	}
}