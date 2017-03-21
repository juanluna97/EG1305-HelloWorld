//Juan Luna
//Objected-Oriented Programming
//Assignment #6 - TestCircle
//20 March 2017
import java.util.Scanner;
public class TestCircle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
	Circle c = new Circle();
	
	System.out.println("Please enter the radius of the circle:");
	double radius = input.nextDouble();
	c.r = radius;
	System.out.println("This circle's radius is: " + c.getRadius());
	System.out.println("This circle's diameter is: " + c.getDiameter());
	System.out.println("This circle's area is: " + c.getArea());
	System.out.println("This circle's circumference is: " + c.getCircumference());
	
}
}