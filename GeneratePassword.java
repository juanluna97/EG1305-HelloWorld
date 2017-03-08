
//Juan Luna
//Objected-Oriented Programming
//Assignment #5 - GeneratePasscode
//8 March 2017
/* The purpose of this code is make the user input a number and tell them the 
 * prime numbers. */
import java.util.Scanner;
import java.util.Random;

public class GeneratePassword {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("How many digits you like to use for a numeric password?");
		int numericPassword = input.nextInt();
		
		for (int i = 0; i < numericPassword; i++) {
			randomGenerator(numericPassword);
			System.out.print(randomGenerator(numericPassword) + " ");
		}
	}

	public static int randomGenerator(int j) {
		Random rand = new Random();
		int number = rand.nextInt(10);
		return number;
	}
}
