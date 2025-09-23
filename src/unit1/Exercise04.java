package unit1;

import java.util.Scanner;

public class Exercise04 {

	public static void main(String[] args) {
		// Create a new Scanner
		Scanner sc = new Scanner(System.in);
		
		//First mark
		float mark1;
		
		//Second Mark
		float mark2;
		
		//The sum of the marks
		float sum; 
		
		//The final mark
		float finalMark;
		
		//The console waits for us to introduce the values
		System.out.println("Introduzca su primera nota:");
		mark1 = sc.nextFloat();
		
		System.out.println("Introduzca su segunda nota:");
		mark2 = sc.nextFloat();
		
		//Print the values in the console
		sum = mark1+mark2;
		finalMark = sum/2;
		
		//The grade is shown in the console
		System.out.println("Su nota media es:" + finalMark);
		
		//Close Scanner
		sc.close();
		

	}

}
