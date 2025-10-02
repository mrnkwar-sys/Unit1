package parte1;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The user's name
		String name;
		
		//The user's address
		String address;
		
		//The user's phone number
		String phone;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca su nombre:");
		name = sc.nextLine();
		
		System.out.println("Introduzca su dirección:");
		address = sc.nextLine();
		
		System.out.println("Introduzca su número de teléfono:");
		phone = sc.nextLine();
		
		//The results are shown in the console
		System.out.println("Nombre:" + name);
		System.out.println("Dirección:" + address);
		System.out.println("Teléfono:" + phone);
		
		//Close Scanner
		sc.close();

	}

}
