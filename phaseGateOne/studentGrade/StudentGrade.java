import java.util.Scanner;
import java.util.Arrays;
public class StudentGrade{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	System.out.print("How many students do you have? ");
	int numberOfStudent = input.nextInt();

	System.out.print("How many subjects do they offer? ");
	int numberOfSubjects = input.nextInt();

	System.out.print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	System.out.println("Saved Successfully.");
	System.out.println();

	int[][] scoresOfStudents = new int[numberOfStudent][numberOfSubjects];
	for(int index = 1; index <= numberOfStudent; index++){
		for(int number = 1; number <= numberOfSubjects; number++){
			System.out.println("Entering score for student " + index);
			System.out.print("Enter score for subject " +number+ " : ");
			int scores = input.nextInt();
		
			if(scores >= 0 && scores <= 100){
				scoresOfStudents[index-1][number-1] = scores;
						System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
				System.out.println("Saved successfully.");
				System.out.println();
			}
			else{
				System.out.println("Invalid input.");
				numberOfSubjects--;
			}
		}
	}
	printScoreBoard(numberOfStudent, numberOfSubjects, scoresOfStudents);
	printSubjectSummary(numberOfSubjects, numberOfStudent, scoresOfStudents);
}

	
public static void printScoreBoard(int numberOfStudent, int numberOfSubjects, int[][] scoresOfStudents){

	double [] sorted = new double[numberOfStudent];
	double [] averageArray = new double[numberOfStudent];

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

	sorted[count -1] = average;
	averageArray[count -1] = average;

	}	
	System.out.println("====================================================================");
	System.out.println();
	System.out.println("====================================================================");
	
	printStudentAverage(numberOfStudent, numberOfSubjects, scoresOfStudents, sorted, averageArray);
}

//public static void printPosition(int total, int totalScore){

//}

public static void printSubjectSummary(int numberOfSubjects, int numberOfStudent, int[][] scoresOfStudents){
	System.out.print("SUBJECT SUMMARY");
	int[] totalScore = new int[numberOfStudent];
	int[] position = new int[numberOfStudent];
	int highestScore = 0;
	int lowestScore = 0;

	int index;
	for(int num = 0; num < numberOfSubjects; num++){
		System.out.printf("SUBJECT: %d%n" , num +1);
		for(index = 0; index <= numberOfStudent; index++){
			if(highestScore <= scoresOfStudents[index][num]){
				highestScore = scoresOfStudents[index][num];
			}
		}
	int indexTwo;
	for(indexTwo = 0; indexTwo < numberOfStudent; indexTwo++){
		if (lowestScore <= scoresOfStudents[indexTwo][num]){
			lowestScore = scoresOfStudents[indexTwo][num];
		}
	}

	System.out.printf("The Highest scoring student is: %d scoring %d", index, highestScore);
	System.out.printf("The Lowest scoring student is: %d scoring %d", indexTwo, lowestScore);
	}

}


public static void printStudentAverage(int numberOfStudent, int numberOfSubjects, int[][] scoresOfStudents, double [] sorted, double[] averageArray){
	int[] range = new int[numberOfStudent];
	Arrays.sort(sorted);
	for(int counter = 0; counter < numberOfStudent; counter++){
		for(int counters = 0; counters < numberOfStudent; counters++){
			if(averageArray[counter] == sorted[counter]){
				range[counter] = numberOfStudent - counter;
				break;
			}
		}
	}
		System.out.println("Student Averages: ");
		for (int count = 0; count < numberOfStudent; count++ ){
			 System.out.printf("Student %d: Average: %.2f%n", 
                              count + 1, averageArray[count]);
		}

	
		
}

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