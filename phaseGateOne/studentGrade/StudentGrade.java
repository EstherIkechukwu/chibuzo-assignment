import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	int failures = 0;
	int passes = 0;
	int total = 0;
	int average = 0;

	System.out.print("How many students do you have? ");
	int numberOfStudent = input.nextInt();

	System.out.print("How many subjects do they offer? ");
	int numberOfSubjects = input.nextInt();

	System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Successfully.");
	System.out.println();

	int[][] scoresOfStudents = new int[numberOfStudent][numberOfSubjects];
	for(int index = 1; index <= numberOfStudent; index++){
		for(int number = 1; number < numberOfSubjects; number++){
			System.out.println("Entering score for student " + index);
			System.out.print("Enter score for subject " +number+ " : ");
			scoresOfStudents [index - 1][number -1] = input.nextInt();
			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully.");
			System.out.println();
		}
	}
	printScoreBoard(numberOfStudent, numberOfSubjects, scoresOfStudents);
}

	
public static void printScoreBoard(int numberOfStudent, int numberOfSubjects, int[][] scoresOfStudents){
	System.out.println("====================================================================");
	System.out.print("STUDENT\t\t ");
		for(int counter = 1; counter <= numberOfSubjects; counter++){  
			System.out.print("SUB" +counter+ "\t" );
		}		
	System.out.println("TOT\tAVE\tPOS\t");
	System.out.println("====================================================================");
	int total = 0;
	for(int count = 1; count <= numberOfStudent; count++){
		System.out.print("Student" +count+ "\t");
		for(int numbers = 1; numbers <= numberOfSubjects; numbers++){
			System.out.print(scoresOfStudents[count - 1][numbers -1] + "\t");
			total += scoresOfStudents[count -1][numbers -1];	
		}
		
		System.out.print(total + "\t");
		double average = total / numberOfSubjects;
		System.out.printf("%.2f\t", average);
		System.out.println("");
	}	
	System.out.println("====================================================================");
	System.out.println();
	System.out.println("====================================================================");

}



public static void printPosition(int total, int totalScore){
	



}

public static void printSubjectSummary(int numberOfSubjects, int numberOfStudent, int[][] scoresOfStudents){
	System.out.print("SUBJECT SUMMARY");
	double averageScore;
	int[] totalScore = new int[numberOfStudent];
	int[] position = new int[numberOfStudent];

	for(int index = 0; index <= scoresOfStudents.length ; index++){
		Arrays.sort(scoresOfStudents[index]);
		int highestScore = index[-1];
		int lowestScore = index[0];

	System.out.printf("The Highest scoring student is: %d", highestScore);
	System.out.printf("The Lowest scoring student is: %d", lowestScore);
	}

	for(int number = 0; number < scoresOfStudents; number++){
		int sum = 0;
		sum += number;
		totalScore.append(sum);
		Arrays.sort(totalScore);
	return totalScore;

	int highestScore = number[-1];
	int lowestScore = number[0];

	averageScore = totalScore[number] / numberOfSubjects;

	}
	System.out.printf("The Total score is: %d", totalScore);
	System.out.printf("The average score is: %s", averageScore);
	
}

//public static String printGradeSummary(){
	

//}

//System.out.print(The hardest subject is subject %d, with %d failures" , subject, failures);
//System.out.print(The easiest subject is subject %d, with %d passes" , subject, passes);
//System.out.print(The overall highest Score is scored by %d, in %d scoring %d" , studentId, subject, score);
//System.out.print(The overall lowest score is scored by %d, in %d scoring %d" , studentId, subject, score);

//System.out.println("=============================================================");

//System.out.print("CLASS SUMMARY");
//System.out.println("=============================================================");

//System.out.print("Best Graduating Student is: +student+ scoring +score+");
//System.out.println("==============================================================");

//System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//System.out.print("Worst Graduating Student is: +student+ scoring +score+");
//System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");

//System.out.println("==============================================================");

//System.out.printf("Class total is : %d", total);
//System.out.printf("Class Average score is : %d", average);


	


}