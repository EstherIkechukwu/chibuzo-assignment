import java.util.Scanner;
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
	System.out.println("Saved Successfully");
	System.out.println();

	int[][] scoresOfStudents = new int[numberOfStudent][numberOfSubjects];
	for(int index = 1; index <= numberOfStudent; index++){
		for(int number = 1; number < numberOfSubjects; number++){
			System.out.println("Entering score for student " + index);
			System.out.print("Enter score for subject " + number+ " : ");

			System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			System.out.println("Saved successfully!");
			System.out.println();
		}
	}
	printScoreBoard(numberOfStudent, numberOfSubjects);
}


public static void printScoreBoard(int numberOfStudent, int numberOfSubjects){
	System.out.println("========================================================");
	System.out.print("STUDENT\t\t");
		for(int counter = 1; counter <= numberOfSubjects; counter++){  
			System.out.print("SUB"+ counter + "\t");
		}		
	System.out.println("TOTAL");

	System.out.println("========================================================");
	for(int count = 1; count <= numberOfStudent; count++){
		System.out.println("");
		System.out.println("");

	}
}


//public static int printAverage(int scoreOfStudents){




//}

//public static String printGradeSummary(){
	//System.out.printf(" The Highest scoring student is: ");
	//System.out.printf(" The Lowest scoring student is: ");
	//System.out.printf(" The Total score is: ");
	//System.out.printf(" The average score is: ");
	//System.out.printf(" The Number of passes: ");
	//System.out.printf(" The Number of fails: ");

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