package unit1;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number the user is going to give
		double number;
		
		//The variable that indicates if it is the number we want
		boolean pairNumber;
		
		//The console waits for us to introduce a number
		System.out.println("Introduzca un número:");
		number = sc.nextDouble();
		
		//We stablish that the program will only admit a pair number
		pairNumber = number%2 == 0;
		
		//The message is shown in the console
		System.out.println("Su número es par:" + pairNumber);
		
		//Close Scanner
		sc.close();
		

	}

}
