package parte2;

import java.util.Scanner;

public class Exercise02 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number without decimals
		int number;
		
		//The number we obtain from the division
		int number1;
		
		//The number we need to sum
		int number2;
		
		//The console waits for us to introduce the number
		System.out.println("Introduzca un número:");
		number = sc.nextInt();
		
		//We calculate the rest that we need to get a number divisible by 7
		number1 = number%7;
		
		//We stablish the condition
		number2 = number1>0 ? 7-number1 : 0;
		
		//The number is shown in the console
		System.out.println("A su número hay que sumarle esta cantidad para que sea múltiplo de 7:" + number2);
		
		//Close Scanner
		sc.close();

	}

}
