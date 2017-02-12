//Juan Luna
//Objected-Oriented Programming
//Assignment #3 - PaperRockScissors
//10 February 2017
/*This is a variation the rock-paper-scissors game, where the user will play against the
 * computer-- the only thing missing is how the computer won if the user lost, although
 * it wasn't required for this assignment*/
import java.util.Random;
import java.util.Scanner;

public class PaperRockScissors 
{
	public static void main (String [] args)
	{
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		
		int retry;
		
		try{
			//Performing a do while to see if the player wants to play again
			do
			{
				//If user wins or ties, counter will signal that user hasn't lost
				int counter=0;
				//Printing instructions and storing user's number
				System.out.println("scissors (0), rock (1), paper (2): 2 ");		
				System.out.print("Choose a number: ");
				int user = input.nextInt();
				int computer =  rand.nextInt(3);
				
				//The computer ties with the user
				if (computer == user)
				{
					System.out.println("It's a tie");
					++counter;
				}
				//Classifying the three types of win
				if (computer == 2 && user == 0)
				{
					System.out.println("You won: scissors beats paper");
					++counter;
				}
				if (computer == 1 && user == 2)
				{
					System.out.println("You won: paper beats rock");	
					++counter;
				}
				if (computer == 0 && user == 1)
				{
					System.out.println("You won: rock beat scissors");	
					++counter;
				}
				//If points out if the user lost if counter didn't increase
				if (counter == 0)
				{
					System.out.println("You lost!");
				}
				System.out.print("Do you want to play again? yes = 1 or no = 0?");
				retry = input.nextInt();
			}
			while(retry == 1);
		   }
		finally 
		{
			input.close();
		}
	}	
}