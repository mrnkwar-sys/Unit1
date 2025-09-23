package unit1;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The first number
		double firstNumber;
		
		//The second number
		double secondNumber;
		
		//The sum of the numbers
		double sum;
		
		//The rest of the numbers
		double rest;
		
		//The numbers multiplied
		double multiply;
		
		//The division
		double division;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca un número:");
		firstNumber = sc.nextDouble();
		
		System.out.println("Introduzca otro número:");
		secondNumber = sc.nextDouble();
		
		/*Print the values in the console
		 * The sum of the numbers
		 */
		sum = firstNumber+secondNumber;
		
		//The rest of the numbers
		rest = firstNumber-secondNumber;
		
		//The numbers multiplied
		multiply = firstNumber*secondNumber;
		
		//The division of the numbers
		division = firstNumber/secondNumber;
		
		//The results are shown in the console
		System.out.println("La suma de sus números es:" + sum);
		System.out.println("La resta de sus números es:" + rest);
		System.out.println("Sus números multiplicados dan:" + multiply);
		System.out.println("Sus números divididos dan:" + division);
		
		//Close Scanner
		sc.close();

	}

}
