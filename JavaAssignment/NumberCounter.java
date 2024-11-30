import java.util.Scanner;
public class NumberCounter{
	public static void main(String[]args){
	Scanner input = new Scanner(System.in);

	int negativeCounter = 0;
	int positiveCounter = 0;
	int zeroCounter = 0;
	int numberCounter = 0;

	
while (numberCounter <= 5){
		System.out.print("Enter a number: ");
		int number = input.nextInt();

		if(number > 0){
		positiveCounter+= 1;
		}
		else if (number < 0){
		negativeCounter+= 1;
		}
		else{
		zeroCounter+= 1;
		}
		numberCounter ++;
	}
		System.out.printf("The number of positive is %d%n'" , positiveCounter);

		System.out.printf("The number of negative is %d%n'" , negativeCounter);
		System.out.printf("The number of zero is %d%n" , zeroCounter);

	
	
	
   }
}