package englishexercisepart2;

import java.util.Scanner;

public class Exercise5 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The user's height
		double height;
		
		//The user's weight
		double weight;
		
		//The user's BMI
		double bmi;
		
		//The console waits for the user to introduce their weight and height
		System.out.println("Introduce your height in meters:");
		height = sc.nextDouble();
		
		System.out.println("Introduce your weight in kilograms:");
		weight = sc.nextDouble();
		
		//We calculate the BMI
		bmi = weight/(height*height);
		
		//We show the result in the console
		System.out.println("Your BMI is:" + bmi);
		
		//Close Scanner
		sc.close();

	}

}
