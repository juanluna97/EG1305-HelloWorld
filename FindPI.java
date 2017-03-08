
//Juan Luna
//Objected-Oriented Programming
//Assignment #5 - FindPI
//8 March 2017
/* The purpose of this code is make the user input a number and tell them the 
 * number of iteration done */
import java.util.*;
import java.lang.*;
import java.io.*;

public class FindPI {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Enter how many iterations you want to go to: ");

		int iterations = input.nextInt();

		double pi = 0;

		if (iterations >= 0) {

			long startTime = System.currentTimeMillis();

			for (int count = 0; count <= iterations - 1; count++) {

				if (count % 2 == 0) {

					pi = pi + (1 / (1 + (2.0 * count))); 

				}

				else {

					pi = pi - (1 / (1 + (2.0 * count))); 

				}

			}

			pi = pi * 4; // obtains the true value of pi

			System.out.println("PI = " + pi + " after " + iterations + " iterations");

			long endTime = System.currentTimeMillis();

			System.out.println("It took " + (endTime - startTime) / 1000.000 + " seconds to complete the operation.");

		} else {

			System.out.println("Iterations must be a non-negative number");

		}

	}

}
