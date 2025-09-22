package unit1;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//declare the age variable
		int age;
		int b;
		
		//Print the value in the console
		System.out.println("Introduzca su edad:");
		
		//The console waits for us to introduce the age
		age = sc.nextInt();
		b = age+1;
		
		//The previous value is shown but +1
		System.out.println("Su edad el año que viene será:" + b);
		
		//Close Scanner
		sc.close();
		

	}

}
