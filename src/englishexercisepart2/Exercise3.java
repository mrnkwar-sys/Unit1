package englishexercisepart2;

import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The height of the rectangle
		double height;
		
		//The length of the rectangle
		double length;
		
		//The perimeter of the rectangle
		double perimeter;
		
		//The area of the rectangle
		double area;
		
		//The console waits for us to introduce the value of the height and the value of the length
		System.out.println("Introduce the height of your rectangle:");
		height = sc.nextDouble();
		
		System.out.println("Introduce the length of your rectangle:");
		length = sc.nextDouble();
		
		//We calculate the perimeter
		perimeter = 2*(height+length);
		
		//We calculate the area
		area = height*length;
		
		//We show the results in the console
		System.out.println("The perimeter of your rectangle is " + perimeter + " and the area is " + area);
		
		//Close Scanner
		sc.close();

	}

}
