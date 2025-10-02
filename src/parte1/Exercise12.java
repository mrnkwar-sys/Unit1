package parte1;

import java.util.Scanner;

public class Exercise12 {

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The price of one kilogram of apples
		final float APPLEPRICE = 2.35f;
		
		//The price of one kilogram of pears
		final float PEARPRICE = 1.95f;
		
		//Kilograms of apples
		double appleKilogram;
		
		//Kilograms of pears
		double pearKilogram;
		
		//The final price of the apples
		double finalPriceApples;
		
		//The final price of pears
		double finalPricePears;
		
		//The total
		double total;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca los kilos de manzanas:");
		appleKilogram = sc.nextDouble();
		
		System.out.println("Introduzca los kilos de peras:");
		pearKilogram = sc.nextDouble();
		
		//The price per the kilograms
		finalPriceApples = appleKilogram*APPLEPRICE;
		finalPricePears = pearKilogram*PEARPRICE;
		
		//The total
		total = finalPriceApples+finalPricePears;
		
		//The total price is shown in the console
		System.out.println("El importe total es:" + total);
		
		//Close Scanner
		sc.close();

	}

}
