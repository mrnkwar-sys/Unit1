package unit1;

import java.util.Scanner;

public class Exercise14 {

	public static void main(String[] args) {
		// Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//1st semester marks
		int firstSemester;
		
		//2nd semester marks
		int secondSemester;
		
		//3rd semester marks
		int thirdSemester;
		
		//Average mark
		int averageMark;
		
		//Academic History's mark
		double academicHistoryMark;
		
		//The console waits for us to introduce our marks
		System.out.println("Tus notas del primer trimestre:");
		firstSemester = sc.nextInt();
		
		System.out.println("Tus notas el segundo simestre:");
		secondSemester = sc.nextInt();
		
		System.out.println("Tus notas el tercer trimestre:");
		thirdSemester = sc.nextInt();

		//We calculate the mark that will be shown in our academic history
		academicHistoryMark = (double) (firstSemester+secondSemester+thirdSemester)/3;
		
		//We calculate the average mark
		averageMark =  (int) academicHistoryMark;
		
		
		//The marks are shown in the console
		System.out.println("Tu nota en el boletín de notas es:" + averageMark);
		System.out.println("Tu nota en el expediente académico es:" + academicHistoryMark);
		
		//Close Scanner
		sc.close();
		
	}

}
