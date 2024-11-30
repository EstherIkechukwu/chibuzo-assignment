import java.util.Scanner;
public class NaturalNumber{
	public static void main(String [] args){
	Scanner input = new Scanner(System.in);
		
		int sum = 0;
		for (int numbers = 1; numbers <= 10; numbers++) {
   			sum = sum + numbers; 	
		}
		System.out.printf("The sum is %d ", sum); 
	
	}

}