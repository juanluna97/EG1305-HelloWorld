//Juan Luna
//Object-Oriented Programming
//Assignment 1 - Circle
//27 January 2017
import java.text.DecimalFormat;
public class Circle {
	public static void main(String[]args)
	{
		DecimalFormat df = new DecimalFormat ("0.0000");
		double radius= 5;
		double area= Math.PI * (radius * radius);
		double diameter = radius * 2;
		System.out.println("The circle's radius is " + radius + ", the area is " + df.format(area));
		System.out.println("The diameter is " + diameter);
	}

}
