package parte2;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The value for "a"
		int numberA;
		
		//The value for "b"
		int numberB;
		
		//The value for "C"
		int numberC;
		
		//The value for "x"
		int numberX;
		
		//The "x" multiplied
		int numberX2;
		
		//We ask the user to introduce the values
		System.out.println("Introduzca un número:");
		numberA = sc.nextInt();
		
		System.out.println("Introduzca un segundo número:");
		numberB = sc.nextInt();
		
		System.out.println("Introduzca un tercer número:");
		numberC = sc.nextInt();
		
		System.out.println("Introduzca un cuarto número:");
		numberX = sc.nextInt();
		
		//The number X needs to be multiplied twice
		numberX2 = numberX*numberX;
		
		//The results are shown in the console
		System.out.println("La fórmula con sus números es: y=" + numberA + "." + numberX2 + "+" + numberB + "." + numberX + "+" + numberC);
		
		//Close Scanner
		sc.close();

	}

}
