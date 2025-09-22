package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//Declare the variables
		float radio;
		double piNumber;
		double perimeter;
		double area;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca el radio de la circunferencia:");
		radio = sc.nextFloat();
		
		//Print the values in the console
		piNumber = Math.PI;
		perimeter = 2*piNumber*radio;
		area = piNumber*radio*radio;
		
		//The results are shown in the console
		System.out.println("El perímetro de la circunferencia es:" + perimeter);
		System.out.println("El área de la circunferencia es:" + area);
		
		//Close Scanner
		sc.close();

	}

}
