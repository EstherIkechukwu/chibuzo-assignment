import java.util.Scanner;

public class CreditCardValidator{
	public static void main(String... args){
	Scanner input = new Scanner (System.in);

	System.out.print("Welcome to Estee's credit card Validator, Kindly Enter your card details to verify: ");
	String cardNumber = input.next();



		checkCardValidity(cardNumber);
		checkCardCategory(cardNumber);
		calculateSecondDigitRightToLeft(cardNumber);
		addSingleDigitRightToLeft(cardNumber);
		addStep2AndStep3(cardNumber);
		getValidity(cardNumber);
		printSampleOutput(cardNumber);
	}

public static boolean checkCardValidity(String cardNumber) {

		if(cardNumber.length() < 13 || cardNumber.length() > 16){
			return true;
		}
		return false;
}


public static String checkCardCategory(String cardNumber){
	String group = "";
		if(cardNumber.charAt(0) == '4'){
			group = "Visa Card";
		}
		else if(cardNumber.charAt(0) == '5'){
			group = "MasterCard";
		}
		else if(cardNumber.charAt(0) == '3' && cardNumber.charAt(1) == '7'){
			group = "American Express Card";
		}
		else if(cardNumber.charAt(0) == '6'){
			group = "Discover cards";
		}
		else {
			group = "Invalid card type";
		}
	return group;
}


public static double calculateSecondDigitRightToLeft(String cardNumber){
	double total = 0;
	for(int index = cardNumber.length()-2; index >= 0; index-=2){
		int number = Integer.valueOf(String.valueOf(cardNumber.charAt(index)));
			number = number * 2;
			if(number >= 9){
				number = number/10 + number%10;
					total += number;
			}
	}
	return total;
}


public static double addSingleDigitRightToLeft(String cardNumber){
	double tot = 0;
	for(int index = cardNumber.length()-1; index >= 0; index-=2){
		int number = Integer.valueOf(String.valueOf(cardNumber.charAt(index)));
			tot += number;
		}
		return tot;
	}
	

public static double addStep2AndStep3(String cardNumber){
		double sum = calculateSecondDigitRightToLeft(cardNumber) + addSingleDigitRightToLeft(cardNumber);
		return sum;
	}


public static String getValidity(String cardNumber){
		String verifier = "";
		if(addStep2AndStep3(cardNumber) % 10 == 0) verifier = "Valid";
		
		else verifier = "Invalid";
	return verifier;
}


public static void printSampleOutput(String cardNumber){
String cardType;
double totals;
String status;

if (checkCardValidity(cardNumber)) {
	cardType = checkCardCategory(cardNumber);
        totals = addStep2AndStep3(cardNumber);
       	status = getValidity(cardNumber);

        System.out.println("*****************************************");
        System.out.println("**Credit Card Type: " + cardType);
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + cardNumber.length());
        status = getValidity(cardNumber);
        System.out.println("**Credit Card Validity Status: " + status);
        System.out.println("*****************************************");
} 
else {
	cardType =checkCardCategory(cardNumber);
        totals = addStep2AndStep3(cardNumber);
        System.out.println("*****************************************");
        System.out.println("**Credit Card Type: " + cardType);
        System.out.println("**Credit Card Number: " + cardNumber);
        System.out.println("**Credit Card Digit Length: " + cardNumber.length());
	status = getValidity(cardNumber);
        System.out.println("**Credit Card Validity Status: " + status);
        System.out.println("*****************************************");
            
}

}

}