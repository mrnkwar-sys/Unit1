package parte1;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The user's age
		int age;
		
		//The user is an adult
		boolean adult;
		
		//The console waits for us to introduce our age
		System.out.println("Introduzca su edad:");
		age = sc.nextInt();
		
		//The question is shown in the console
		adult = age >=18;
		System.out.println("¿Eres mayor de edad?"+ adult);
		
		//Close Scanner
		sc.close();
		
	}

}
