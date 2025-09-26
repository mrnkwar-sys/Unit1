package unit1;

import java.util.Scanner;

public class Exercise13 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//If it is raining or not
		boolean ItsRaining;
		
		//If we finished our homework
		boolean FinishedHomework;
		
		//If we go to the library or not
		boolean GoToLibrary;
		
		//If we can go outside
		boolean GoOutside;
		
		//The console waits for us to introduce our answers
		System.out.println("¿Está lloviendo?");
		ItsRaining = sc.nextBoolean();
		
		System.out.println("¿Has terminado tus tareas?");
		FinishedHomework = sc.nextBoolean();
		
		System.out.println("¿Vas a ir a la biblioteca?");
		GoToLibrary = sc.nextBoolean();
		
		//We can go outside if it is not raining and we finished our homework
		GoOutside = (FinishedHomework && ItsRaining) || GoToLibrary;
		
		//The result that tell us if we can go outside or not is shown in the console
		System.out.println("¿Puedo salir fuera?" + GoOutside);
		
		//Close Scanner
		sc.close();

	}

}
