package unit1;

import java.util.Scanner;

public class Exercise15 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The price the user has introduced
		double price;
		
		//The price taking into account the IVA
		double finalPrice;
		
		//The console waits for us to introduce the price
		System.out.println("Introduzca un precio:");
		price = sc.nextDouble();
		
		//We calculate the final price
		finalPrice = price+price*21/100;
		
		//The console shows the results
		System.out.println("Su precio con el IVA incluido es:" + finalPrice);
		
		//Close Scanner
		sc.close();

	}

}
