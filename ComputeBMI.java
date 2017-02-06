//Juan Luna
//Objected-Oriented Programming
//Assignment #2 - ComputerBMI
//5 February 2017
/*The purpose of this code is to use JOptionPane to prompt the user for their height
 * and weight in inches and kg. This will convert that into their respective units and 
 * calculate the BMI.*/

import javax.swing.JOptionPane;
public class ComputeBMI {
	
	public static void main (String [] args){
		
	//Asking the user for the information
	String UserWeight = JOptionPane.showInputDialog("Enter your weight in pounds. ");
	double Weight = Double.parseDouble(UserWeight);
		
	String UserHeight = JOptionPane.showInputDialog("Enter your height in inches. ");
	double Height = Double.parseDouble(UserHeight);
		
	//Calculations are done here
	double BMI = (Weight * 0.45359237) / ((Height * 0.0254)*(Height * 0.0254));
		
	//Printing results
	JOptionPane.showMessageDialog( null, "Your Body Mass Index is " + BMI);
	}
}
