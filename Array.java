import java.util.*;
public class Array {

	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		System.out.println("This program will find the highest, "
				+ "lowest, average and the sum of the numbers that you will enter "
				+ "\nHow many numbers do you want to enter? ");
		int counter = input.nextInt();
		System.out.println("Enter a series of 3 numbers. ");
		for (int i=0; i < counter; i++ ){
			System.out.println("Enter number " + i);
			int a = input.nextInt();
			int[] array;
			array = new int[a];
		}
		//getHighestElement(int []array);
		//getLowestElement(int []array);
		//getSum(int []array);
		//getAverage(int []array);
		System.out.println("The highest element is: "  );
		System.out.println("The lowest element is: ");
		System.out.println("The sum of the elements is: ");
		System.out.println("The average of the elements: ");
	}
	public static int getHighestElement(int []array){
		//if ([0]array > [1]array && [0]array > [2]array)
		return 1;
	}
	public static int getLowestElement(int []array){
		return 1;
	}
	public static int getSum(int []array){
	return 1;
	}
	public static int getAverage(int []array){
	return 1;
	}
}
