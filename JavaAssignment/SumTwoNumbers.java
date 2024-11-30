import java.util.Scanner;
public class SumTwoNumbers{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);
	boolean condition = true;

	do{

		System.out.print("Enter first number: ");
		int number1 = input.nextInt();
		System.out.print("Enter Second number: ");
		int number2 = input.nextInt();
		int sum = number1 + number2;
		System.out.printf("the sum is %d%n " , sum);
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
	while(condition);
	
	}
	
}