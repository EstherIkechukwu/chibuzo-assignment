public class LargestElement{
	public static void main(String... esther){

	int[] value = {2,4,6,8,10};

	System.out.print(printElement(value));

}
 	public static int printElement(int[] numbers){
		int largest = numbers[0];

		for(int number : numbers){
			if(number > largest) largest = number;
		}
		return largest;
		
	}


}