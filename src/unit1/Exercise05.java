package unit1;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//The radio of the circle
		float radio;
		
		//The PI number
		double piNumber;
		
		//The perimeter of the circle
		double perimeter;
		
		//The perimeter of the circle
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
