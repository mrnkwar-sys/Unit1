package parte2;

import java.util.Scanner;

public class Exercise08 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The distance asked to the user, with decimals and in meters
		double realDistance;
		
		//The distance in centimeters, without decimals
		double distance;
		
		//The console waits for the user to introduce the value of the distance
		System.out.println("Introduzca la longitud de su lanzamiento en metros:");
		realDistance = sc.nextDouble();
		
		//The meters turned into cm
		distance = realDistance*100;
		
		//The console shows the value without the decimals
		System.out.println("Su longitud, en cm, ha sido de:" + (int) distance);
		
		//Close Scanner
		sc.close();

	}

}
