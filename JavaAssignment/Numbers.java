import java.util.Scanner;
public class Numbers{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.print("Enter first number: ");
	int firstNumber = input.nextInt();

	System.out.print("Enter second number: ");
	int secondNumber = input.nextInt();

	int counter = 1;
	int result = 1;

	while (counter <= secondNumber){
	result *= firstNumber;
	counter += 1;
	}

	System.out.printf("%d raised to power of %d " , firstNumber, secondNumber , result);	
	}
}