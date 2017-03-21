//Juan Luna
//Objected-Oriented Programming
//Assignment #6 - Distance
//20 March 2017
import java.util.Scanner;
import java.text.DecimalFormat;

public class Distance {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");

		System.out.println("The program will calculate the distance between two points");
		System.out.println("Please enter the x and y values for the first point");
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();

		System.out.println("Please enter the x and y values for the second point");
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		double newdistance=getDistance(x1, y1, x2, y2);
		System.out.println("The distance between these two points is " + df.format(newdistance));
	}
	
	public static double getDistance(double i1, double j1, double i2, double j2){
		double distance = Math.sqrt((i2 - i1) * (i2 - i1) + (j2 - j1) * (j2 - j1));
		return distance;
	}
}
