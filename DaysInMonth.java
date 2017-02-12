//Juan Luna
//Objected-Oriented Programming
//Assignment #3 - DaysInMonth
//10 February 2017
/* The purpose of this code is to promp the user for a year and month, and return how 
 * many days are present during that month, including a leap year.*/
import javax.swing.JOptionPane;

public class DaysInMonth
{
	public static void main(String[] args)
	{
		//The code asks for the year and month
		String YearInput = JOptionPane.showInputDialog("Please enter a year: ");
		int year = Integer.parseInt(YearInput);
		String MonthInput = JOptionPane.showInputDialog("Please enter a month: ");
		int m = Integer.parseInt(MonthInput);
		
		// This if separates the months that have 31 days.
		if (m == 1 || m == 3 || m== 5 || m == 7 || m==8 || m==10 || m==12)
		{
			JOptionPane.showMessageDialog( null, "There are 31 days in " + m + "/" + year);
		}
		// This if separates the months that have 30 days.
		if (m == 4 || m == 6 || m== 9 || m == 11)
		{
			JOptionPane.showMessageDialog( null, "There are 30 days in " + m + "/" + year);
		}
		// This if accounts for the leap year
		if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)) && (m ==2))
		{
			JOptionPane.showMessageDialog( null, "There are 29 days in " + m + "/" + year);	
		}
		// This if separates the months that have 28 days.
		else if (m ==2)
		{
			JOptionPane.showMessageDialog( null, "There are 28 days in " + m + "/" + year);
		}
	}
}     