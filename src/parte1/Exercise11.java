package parte1;

import java.util.Scanner;

public class Exercise11 {

	public static void main(String[] args) {
		// Create the Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number given by the user
		double peseta;
		
		//The same money, but in euros
		double euro;
		
		//The console waits for us to introduce the quantity of money
		System.out.println("Introduzca una cantidad de pesetas:");
		peseta = sc.nextDouble();
		
		//The pesetas turned into euros
		euro = peseta/166;
		
		//The results are shown in the console
		System.out.println("Sus pesetas, en euros, son:" + euro);
		
		//Close Scanner
		sc.close();

	}

}
