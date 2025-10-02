package parte2;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The asked number
		double number;
		
		//The number shown in the console
		double number1;
		
		//The console waits for us to introduce a number
		System.out.println("Introduzca un número con decimales:");
		number = sc.nextDouble();
		
		//We calculate the number that we want to show in the console
		number1 = number+0.5;
		
		//The number is shown in the console
		System.out.println("Su número redondeado es:" + (int) number1);
		
		//Close Scanner
		sc.close();
		

	}

}
