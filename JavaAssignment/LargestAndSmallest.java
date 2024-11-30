import java.util.Scanner;
public class LargestAndSmallest{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);

	Boolean condition = true;
	int largest = 0;
	int smallest = 0;

		while (condition){
			System.out.print("Enter a number: ");
			int number = input.nextInt();
		if (number > largest) {
			largest = number;
		} 

		else if (number < smallest) {
			smallest = number;
		}

		System.out.print("do you want to perform the operation again? if yes press 1, if no press 0 ");

		int choice = input.nextInt();
		if(choice == 1){
			condition = true;
		}
		else if(choice == 0){
			condition = false;
		}
		else{
			System.out.print("invalid");
			condition = false;

		}
	}

	System.out.printf("The largest is %d%nthe smallest is %d", largest, smallest);
	
	}

}