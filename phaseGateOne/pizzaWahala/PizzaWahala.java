import java.util.Scanner;

public class PizzaWahala{
	public static void main(String... args) {
	Scanner input = new Scanner(System.in);
	printOrders( 45, "odogwu");

	}
	
	public static void printOrders(int size, String pizzaType){
		switch (pizzaType.toLowerCase()) {
		case "supa size": 
		printCalculateOrder(size, 4, pizzaType, 2500); 
		break;

		case "small money": 
		printCalculateOrder(size, 6, pizzaType, 2900); 
		break;

		case "big boys": 
		printCalculateOrder(size, 8, pizzaType, 4000); 
		break;

		case "odogwu": 
		printCalculateOrder(size, 12, pizzaType, 5200); 
		break;

		default: System.out.print("Wrong option, Try again!");
		}
		

	}

	public static void printCalculateOrder(int size, int pizzaSlice, String pizzaType, int amount){
	int counter = 0;
	int slice = 0;

		while(slice < size){
			slice += pizzaSlice;
		
		counter++;
		}
	printDetails(counter, size, pizzaSlice, pizzaType, amount, slice);
	}


	public static void printDetails(int counter, int size, int pizzaSlice, String pizzaType, int amount, int slice){
	System.out.print("Number of boxes of pizza to  buy " +counter+ " (explanation " +pizzaType+ " contains " +slice+ " per box " +counter+ " boxes should be sufficent for " +size+ " persons as it would contain " +slice+ " in all) ");
	System.out.println();
	System.out.print("Number of leftover slices after serving is " +(slice - size)+ " after serving " +slice+ " slices you should have "  +slice+ " slices left ");
	System.out.println();
	System.out.print("price = " +(counter * amount)+ " (explanation : " +amount+ " per box for " +counter+ " boxes) ");
	}





}