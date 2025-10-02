package parte1;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The year someone was born
		int bornYear;
		
		//The current year
		int thisYear;
		
		//The age of the person
		int yourAge;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca su año de nacimiento:");
		bornYear = sc.nextInt();
		
		System.out.print("Introduzca el año actual:");
		thisYear = sc.nextInt();
		
		//Print the values in the console
		yourAge = thisYear-bornYear;
		
		//The age of the user is shown
		System.out.println("Tu edad es:" + yourAge);
		
		//Close Scanner
		sc.close();

	}

}
