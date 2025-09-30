package parte2;

import java.util.Scanner;

public class Exercise05 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The quantity of seconds asked
		int secondsAsked;
		
		//The hours shown in the console
		int hours;
		
		//The minutes shown in the console
		int minutes;
		
		//The rest of the seconds shown in the console
		int seconds;
		
		//The rest of the hours
		final int restHours;
		
		//The rest of the minutes
		final int restMinutes;
		
		//We ask the user to introduce a quantity of seconds
		System.out.println("Introduzca un número de segundos:");
		secondsAsked = sc.nextInt();
		
		//Calculate the hours
		hours = secondsAsked>=3600 ? secondsAsked/3600 : 0;
		
		//Calculate the minutes
		restHours = secondsAsked%3600;
		minutes = secondsAsked>=60 ? restHours/60 : 0;
		
		//Calculate the seconds
		restMinutes = minutes%60;
		seconds = secondsAsked<=60 ? restMinutes/60 : 0;
		
		//The results are shown in the console
		System.out.println("Sus segundos son: " + hours + "h" + minutes + "min" + seconds + "s");
		
		//Close Scanner
		sc.close();

	}

}
