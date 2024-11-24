public class Kata{
	public static void main(String... esther){

	int value = 5;

	System.out.print(printFactorialOfInteger(value));
}

	public static boolean printEvenNumber(int integer){
		if(integer % 2 == 0){
			return true;
		}
		return false;
	}

	
	public static boolean printPrimeNumber(int number){
		for(int count = 0; count <= number; count ++){
			if(number % count == 0){
				return true;
			}
		}
		return false;
	}

	public static int printDifference(int numberOne, int numberTwo){
		if(numberOne > numberTwo){
			int difference = numberOne - numberTwo;
			return difference;
		}
		else{
			int difference = numberTwo - numberOne;
			return difference;
		}
		


	}

	public static int printNumberDivision(int numberOne, int numberTwo){
		int product = numberOne / numberTwo;	

	}

	public static int printFactorOfInteger(int number){
		int counter = 0;
		for(int count = 1; count <= number; count++){
			if(number % count == 0){
				counter++;
			}
		}
		return counter;
	}

	public static boolean printSquareOfIntegers(int integer) {
		for(int counter = 0; counter < (integer/2); counter++){
			if(counter * counter == integer){
				return true;
			}
		} 
		return false;
	
	}

	public static boolean printPalindrome(int number) {
		for(int count = 0; count < number; count++){
		
		}
	}

	public static int printFactorialOfInteger(int integer) {
		int factorial = 1;
		for(int num = integer; num > 1; num--){
        		factorial = factorial * num;
		}
		return factorial;
	
	}

	public static int printSquareOfInteger(int integer) {
		int square = integer * integer;
		return square;
	
	}











}