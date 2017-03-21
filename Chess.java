//Juan Luna
//Objected-Oriented Programming
//Assignment #6 - Chess
//20 March 2017
public class Chess {
	public static void main(String[] args) {
		
		int total = 0;
		
		for (int n = 0; n < 69; n++) {
			
			int number = TotalGrains(n);
			total = total + number;
			
			if (n == 68) {
				System.out.println("The total numbers of wheat covered is " + total);
			}
		}
		
		LastGrains();
		System.out.println("The numbers of wheat covered is " + LastGrains());
	}

	public static int TotalGrains(int j) {
		int grains = (j * j);
		return grains;

	}

	public static int LastGrains() {
		int lastg = 68 * 68;
		return lastg;
	}
}
