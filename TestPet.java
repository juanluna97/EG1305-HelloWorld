import java.util.Scanner;
public class TestPet {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);

		Pet p = new Pet();
		
		System.out.println("Please enter your pet's name ");
		
		String nam = input.nextLine();
		p.name = nam;
		
		System.out.println("Please enter your pet's type ");
		
		String typ = input.nextLine();
		p.type = typ;
		
		System.out.println("Please enter your pet's age ");
		
		int ag = input.nextInt();
		p.age = ag;
		
		System.out.println("Pet object created");
		System.out.println(p.PetName());
		System.out.println(p.PetType());
		System.out.println(p.PetAge());
				
	}

}

