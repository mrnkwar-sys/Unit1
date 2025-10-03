package englishexercisepart2;

import java.util.Scanner;

public class Exercise6 {

	public static void main(String[] args) {
		//Create a Scanner
		Scanner sc = new Scanner(System.in);
		
		//The number of students
		int students;
		
		//The number of teams that can be formed
		int teams;
		
		//The size of the teams
		int teamSize;
		
		//The number of students that are left
		int restStudents;
		
		//The console waits for us to introduce the number of students and the size of the groups
		System.out.println("Introduce the number of students:");
		students = sc.nextInt();
		
		System.out.println("The size of the groups:");
		teamSize = sc.nextInt();
		
		//We calculate how many teams can be formed
		teams = students/teamSize;
		
		//We calculate how many students will be left out of a team
		restStudents = students/teams;
		

	}

}
