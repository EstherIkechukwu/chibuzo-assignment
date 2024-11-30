public class Table{
	public static void main(String [] args){
	System.out.println("a\tb\tpow(a, b)");
	int a = 1;
	int b = 0;
	double power = 0;

	while (a <= 5) {
		b = a + 1;
		power = Math.pow(a, b);
		System.out.printf("%d\t%d\t%.0f\n", a,b,power);
		a++;
	}
	

	}
}