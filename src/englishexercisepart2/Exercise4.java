package englishexercisepart2;

import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The value in pounds
		double pound;
		
		//The value in kilograms
		double kilo;
		
		//The console waits for us to introduce the pounds
		System.out.println("Introduce a quantity in pounds:");
		pound = sc.nextDouble();
		
		//We calculate how much is that quantity in kilograms
		kilo = pound/2.2;
		
		//We show the result in the console
		System.out.println("Your quantity expressed in kilograms is " + kilo);
		
		//Close Scanner
		sc.close();

	}

}
