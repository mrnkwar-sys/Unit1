package englishexercisepart2;

import java.util.Scanner;

public class Exercise2 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The age of the user
		int age;
		
		//The year when they were born
		int year;
		
		//The console waits for the user to introduce their age
		System.out.println("Introduce your age:");
		age = sc.nextInt();
		
		//We calculate when they were born
		year = 2025-age;
		
		//The console shows the result
		System.out.println("You were born in " + year);
		
		//Close Scanner
		sc.close();

	}

}
