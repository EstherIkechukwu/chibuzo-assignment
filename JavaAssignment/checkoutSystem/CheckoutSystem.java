import java.util.Scanner;
import java.util.ArrayList;

public class CheckoutSystem{
	public static void main(String... args){
	Scanner input = new Scanner(System.in);

	ArrayList<String> product = new ArrayList<>();
	ArrayList<Integer> itemsNumber = new ArrayList<>();
	ArrayList<Double> itemPrice = new ArrayList<>();
	
	System.out.print("What is the customers name: ");
	String name = input.nextLine();
	
	printDisplayQuestion(name, input, product, itemsNumber, itemPrice);

}

	public static void printDisplayQuestion(String name, Scanner input, ArrayList<String> product, ArrayList<Integer> itemsNumber, ArrayList<Double> itemPrice ){
		System.out.print("What did the user buy? ");
		String itemPurchase = input.nextLine();
		product.add(itemPurchase);

		System.out.print("How many pieces: ");
		int quantity = input.nextInt();
		itemsNumber.add(quantity);

		System.out.print("How much per unit: "); 
		double price  = input.nextDouble();
		itemPrice.add(price);

		input.nextLine();
		System.out.print("Do you want to add more items? ");
		String moreItems = input.nextLine();

		if(moreItems.equalsIgnoreCase("yes")){
			printDisplayQuestion(name, input, product, itemsNumber, itemPrice);
		}
		else{
			System.out.print("What is your name ?");
			String cashierName = input.nextLine();
		
			System.out.print("How much discount will he/she get? ");
			double discount = input.nextDouble();
			printInvoice(name, cashierName, input, product, itemsNumber, itemPrice, discount);
		}

	}

	public static void printInvoice(String name, String cashierName, Scanner input, ArrayList<String> product, ArrayList<Integer> itemsNumber, ArrayList<Double> itemPrice, double discount) {
		System.out.print("""
SEMICOLON STORES
MAIN BRANCH
LOCATION: 312 HERBERT MACAULAY WAY, SABO YABA, LAGOS.
DATE: 18TH-DEC-22 7:25pm
""");
			System.out.printf("%s%n", cashierName);
			System.out.printf("%s%n", name);
			System.out.println("=================================================");
			System.out.println("ITEM\tQTY\tPRICE\tTOTAL(NGN)");
			for (int index = 0; index < product.size(); index++) {
				System.out.printf("%s\t%d\t%.2f\t%.2f%n", product.get(index), itemsNumber.get(index), itemPrice.get(index), (itemsNumber.get(index) * itemPrice.get(index)));
			}

	}



  

}