package parte2;

import java.util.Scanner;

public class Exercise03 {

	public static void main(String[] args) {
		//Create the Scanner
		Scanner sc = new Scanner(System.in);
		
		//The first number introduced
		int number1;
		
		//The second number introduced
		int number2;
		
		//The number that we get from dividing number1 by number2 
		int numberDivision;
		
		//	The rest that we need to add to number1
		int restNumber;
		
		//We ask the user to introduce a number
		System.out.println("Introduzca un número:");
		number1 = sc.nextInt();
		
		//We ask the user to introduce another number
		System.out.println("Introduzca otro número:");
		number2 = sc.nextInt();
		
		//We calculate the rest that we need to get
		numberDivision = number1%number2;
		
		//We calculate the rest that we need to add to number1
		restNumber = number1>0 ? number2-numberDivision : 0;
		
		//We show the result in the console
		System.out.println("El número que necesita sumarle a su primer número es:" + restNumber);
		
		//Close Scanner
		sc.close();

	}

}
