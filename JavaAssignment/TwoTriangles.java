public class TwoTriangles{
	public static void main(String... esther){
	
	 printTwoTriangle(8);

}

	public static void printStar(){
		System.out.print("* ");
	}

	public static void printNewLine(){
		System.out.println();
	}

	public static void printStar(int numberOfTimes){
		for(int index = 0; index < numberOfTimes; index++){
			printStar();
		}	
	}
	
	public static void printUpperTriangle(int numberOfStars){
		for(int index = 1; index <= numberOfStars; index++){
			printStar(index);
			printNewLine();
		}
	}

	public static void printLowerTriangle(int numberOfStars){
		for(int index = numberOfStars; index > 0; index--){
			printStar(index);
			printNewLine();
		}
	}

	public static void printTwoTriangle(int length){
		printUpperTriangle(length);
		printLowerTriangle(length);
	}








}