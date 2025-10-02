package parte2;

import java.util.Scanner;

public class Exercise09 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The problem given
		int problem;
		
		//The volume where the problem is contained
		int volume;
		
		//The console waits for us to introduce the problem
		System.out.println("Introduzca el identificador de su problema:");
		problem = sc.nextInt();
		
		//We establish the condition to know where is the problem contained
		volume = problem/100;
		
		//We show the volume in the console
		System.out.println("Su problema está contenido en el volumen " + volume);
		
		//Close Scanner
		sc.close();
			

	}

}
