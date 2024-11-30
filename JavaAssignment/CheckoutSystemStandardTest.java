import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class CheckoutSystemStandardTest{

	@Test
	public void printDisplayQuestionExists() {

		//given(pre-conditions)
		CheckoutSystem checkoutSystem = new CheckoutSystem();

	}

	@Test
	public void printDisplayQuestionBeforeInputTest() {
		//given(pre-conditions)
		CheckoutSystem checkoutSystem = new CheckoutSystem();

		//action (the functionality being tested)
		String name = "Chinwe";
		ArrayList<String> product = new ArrayList<>();
		product.add("s");
		ArrayList<Integer> itemsNumber = new ArrayList<>();
		ArrayList<Double> itemPrice = new ArrayList<>();

		//check
		ArrayList<String> actual = checkoutSystem.printDisplayQuestion(name , product, itemsNumber, itemPrice);
		ArrayList<String> expected = new ArrayList<>();
		expected.add("s");
		assertEquals(expected, actual);

	}
}


