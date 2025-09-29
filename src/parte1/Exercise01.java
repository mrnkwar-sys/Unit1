package parte1;

import java.util.Scanner;

public class Exercise01 {

	public static void main(String[] args) {
		// create a new Scanner
		Scanner sc = new Scanner(System.in);

		// The number written in the console
		int numero;

		// Print the value in the console
		System.out.print("Introduzca un número:");

		// The console waits for us to introduce the number
		numero = sc.nextInt();
		
		//Show the value in the console
		System.out.println("Ha escrito:" + numero);

		// Close Scanner
		sc.close();

	}
}