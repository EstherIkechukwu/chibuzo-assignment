	
def get_score_board(number_of_student, number_of_subjects, scores_of_students : list):
print("====================================================================");
print("STUDENT\t\t ")
for counter in number_of_subjects: 
	print(f"SUB" {counter} "\t" )		
	print("TOT\tAVE\tPOS\t\n")
	print("====================================================================")
total = 0;
for count in number_of_student:
	print("Student" {count} "\t")
		for numbers in number_of_subjects:
			print(scores_of_students[count - 1][numbers -1] , "\t")
			total += scores_of_students[count -1][numbers -1]	
		
		print(total , "\t")
		average = total / number_of_subjects
		print(f"%.2f\t" {average});
		println("")
	
	print("====================================================================")
	print()
	print("====================================================================")

def get_input():
failures = 0
passes = 0
average = 0

number_of_student = int(input("How many students do you have? "))

number_of_subjects = int(input("How many subjects do they offer? "))
	print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
	println("Saved Successfully.")
	println()

	scores_of_students = [[number_of_student][number_of_subjects]]
	for index in number_of_student:
		for number in number_of_subjects:
			print("Entering score for student " + index)
			print("Enter score for subject " + number+ " : ")
			scores_of_students [index - 1][number -1]
			
		print("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
		print("Saved successfully.")
		print()
	
	print(printScoreBoard(number_of_student, number_of_subjects, scores_of_students))




//public static void printSubjectSummary() {
	int highestScore =
	int lowestScore = 
	//System.out.printf(" The Highest scoring student is: %d scoring %d");
	//System.out.printf(" The Lowest scoring student is: %d scoring %d");
	//System.out.printf(" The Total score is: %d");
	//System.out.printf(" The average score is: %s");
	//System.out.printf(" The Number of passes: %d");
	//System.out.printf(" The Number of fails: %d");


}

