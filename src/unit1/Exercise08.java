package unit1;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The user's age
		int age;
		
		//The user's name
		String name;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca su nombre:");
		name = sc.nextLine();
		
		System.out.println("Introduzca su edad:");
		age = sc.nextInt();
		
		//The message is shown in the console
		System.out.println("Hola " + name + ", tienes " + age + " años, ¡qué mayor eres!");
		
		//Close Scanner
		sc.close();

	}

}
