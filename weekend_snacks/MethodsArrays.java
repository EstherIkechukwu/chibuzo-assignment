public class MethodsArrays{
	public static void main(String... esther){

}
 	public static int printElement(int[] numbers){
		int largest = numbers[0];

		for(int number : numbers){
			if(number > largest) largest = number;
		}
		return largest;	
	}

	
	public static void printReversedList(int[] numbersReversed){
		for(int index = numbersReversed.length -1 ; index >= 0; index--){
			System.out.print(numbersReversed[index] + " ");
		}
	}


	public static boolean printElementOccurance(int[] number, int specialValue){
		for(int index = 0; index < number.length; index ++){
			if(number[index] == specialValue); return true;
		}
		return false;

	}

	public static void printOddElement(int[] integers){
		for(int index = 0; index < integers.length; index ++){
			if(integers[index] % 2 != 0){
				System.out.print(integers);
			}
		}
	}

	public static void printEvenElement(int[] integers){
		for(int index = 0; index < integers.length; index ++){
			if(integers[index] % 2 == 0){
				System.out.print(integers);
			}
		}
		
	}
	
	public static void printTotal(int[] numbers){
		int total = numbers[0];
		for(int number : numbers){
			total += number;
			System.out.print(total);
		}
	}
	
	public static boolean printPalindrome(String text){
		String reversed = "";
		for(int letter = 0; letter < text.length(); letter++){
		reversed = text.charAt(letter) + reversed;
		}
			if(reversed.equals(text)){
				return true;
			}
			return false;
	}

	public static void printSumOfNumbersOne(int[] numbers){
		int sum = 0;
		for(int number : numbers){
			sum += number;
		}
		System.out.print(sum);
	}

	public static void printSumOfNumbersTwo(int[] numbers){
		int counter = 0;
		int sum = 0;
		while(counter < numbers.length){
			sum += numbers[counter];
		counter++;
		}
		System.out.print(sum);
	}

	public static void printSumOfNumbersThree(int[] numbers){
		int counter = 0;
		int sum = 0;

		do{
			sum += numbers[counter];
		counter++;
		}
		while(counter < numbers.length);
		System.out.print(sum);
	}

	public static int[] printAddedList(int number){
		String newNumber = "";
		newNumber += number;
		int[] numbers = new int[newNumber.length()];

		for (int index = 0; index < newNumber.length(); index++) {
			int remainder = number % 10;
			numbers[(newNumber.length() - 1) - index] = remainder;
			number = number / 10;
		}

		return numbers;



	}
	



}