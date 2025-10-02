package parte2;

import java.util.Scanner;

public class Exercise10 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The year given
		int year;
		
		//The century it belongs to
		int century;
		
		//The console waits for us to introduce a year
		System.out.println("Introduzca un año:");
		year = sc.nextInt();
		
		//We calculate the century
		century = (year/100)+1;
		
		//We show the century in the console
		System.out.println("El año que ha introducido pertenece al siglo " + century);
		
		//Close Scanner
		sc.close();

	}

}
