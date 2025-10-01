package parte2;

import java.util.Scanner;

public class Exercise07 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//Number of childish tickets bought by the user
		int childTicket;
		
		//Number of childish tickets bought by the user
		int adultTicket;
		
		//Price of the childish ticket
		final double childPrice = 15.5;
		
		//Price of the tickets for adults
		final int adultPrice = 20;
		
		//The price of the childish tickets that the user has bought
		double childBought;
		
		//The price of the childish tickets that the user has bought
		double adultBought;
		
		//The price of all the tickets the user has bought
		double finalPrice;
		
		//The discount
		double finalPriceD;
		
		//The console waits for us to introduce the number of tickets bought
		System.out.println("Introduzca el número de tickets infantiles que quiere:");
		childTicket = sc.nextInt();
		
		System.out.println("Introduzca el número de tickets para adulto que quiere:");
		adultTicket = sc.nextInt();
		
		//We calculate the price of the tickets for children
		childBought = childTicket*childPrice;
		
		//We calculate the price of the tickets for adults
		adultBought = adultTicket*adultPrice;
		
		//We establish the final price
		finalPrice = childBought+adultBought;
		
		//We establish the condition for the discount
		finalPriceD = finalPrice>=100 ? finalPrice*0.95 : finalPrice;
		
		//We show the price in the console
		System.out.println("El precio total de sus entradas es:" + finalPriceD);
		
		//Close Scanner
		sc.close();

	}

}
