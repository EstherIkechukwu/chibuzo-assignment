import java.util.Arrays;
import java.util.InputMismatchException;

public class HugeInteger{

private int[] integers = new int[40];


public static void main(String... args){
	
	String number = "12345";
	HugeInteger hugeInteger = new HugeInteger();
	hugeInteger.parse(number);
	System.out.print(hugeInteger.toString());
	
}

public void parse(String values){
	verifyNumber(values);		
	convertStringToIntArray(values);
	
}
private void convertStringToIntArray(String values){
	for(int number = 0; number < values.length(); number++){
		char newInt = values.charAt(number);
		integers[number] = Integer.valueOf(Character.toString(newInt));
		
	}
}

private void verifyNumber(String values){
	for(int num = 0; num < values.length(); num++){ 
		char first = values.charAt(num);
		if(!Character.isDigit(first)){
			throw new InputMismatchException("Input is not a number");
		}
		
	}
}

@Override
public String toString() {
	String emptyString = "";
	for(int number = 0; number < integers.length; number++) {
		String newString = String.valueOf(integers[number]);
		emptyString += newString;
	}
	return emptyString;
}
	
}
