import java.util.Scanner;

public class TestFan {
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);

	Fan f = new Fan();

	System.out.println("Please enter fan's color: ");
	
	String clr = input.nextLine();
	f.color = clr;
	
	System.out.println("Please enter fan's status: ");
	
	Boolean stat = input.nextBoolean();
	f.fanStatus = stat;
	
	System.out.println("Please enter fan's speed: ");
	
	int spd = input.nextInt();
	f.fanSpeed = spd;
	
	System.out.println("Please enter fan's radius: ");
	
	int rad = input.nextInt();
	f.radius = rad;
			
	System.out.println("Fan object created");
	System.out.println(f.toString());
}
}