package parte2;

import java.util.Scanner;

public class Exercise06 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The centimeters asked
		int cm;
		
		//The millimeters asked
		int mm;
		
		//The meters asked
		int meter;
		
		//The millimeters turned into cm
		double turnedmm;
		
		//The meters turned into cm
		double turnedm;
		
		//The final result
		double result;
		
		//The console waits for us to introduce the measures
		System.out.println("Introduzca una medida en milímetros:");
		mm = sc.nextInt();
		
		System.out.println("Introduzca otra medida expresada en centímetros:");
		cm = sc.nextInt();
		
		System.out.println("Introduzca una última medida expresada en metros:");
		meter = sc.nextInt();
		
		//We express the millimeters in centimeters
		turnedmm = mm/10;
		
		//We express the meters in cm
		turnedm = meter*100;
		
		//We calculate the final sum
		result = turnedmm+turnedm+cm;
		
		//We show the result in the console
		System.out.println("Sus medidas en cm suman:" + result);
		
		//Close Scanner
		sc.close();

	}

}
