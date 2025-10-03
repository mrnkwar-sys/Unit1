package englishexercisepart2;

import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The price introduced
		double price;
		
		//The taxes
		double tax;
		
		//We show the title of the web page
		System.out.println("TAX CALCULATOR");
		
		//The console waits for us to introduce the price and the value of the taxes
		System.out.println("Introduce a price:");
		price = sc.nextDouble();
		
		System.out.println("Introduce the tax:");
		tax = sc.nextDouble();
		
		//Calculate the price with taxes
		price = price*(1+tax/100);
		
		//Show the result in the console
		System.out.println("The price with taxes is:" + price);
		
		//Close Scanner
		sc.close();
		

	}

}
