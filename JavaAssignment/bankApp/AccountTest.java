package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account myAccount;

    @BeforeEach
    public void startWith(){
        myAccount = new Account("1234", "0000", "Esther", "Ikechukwu", 0);
    }

    @Test
    public void testThatAccountIsEmpty(){
        assertTrue(myAccount.isEmpty());
    }

    @Test
    public void testThatMyAccountCanCreateAnAccount() {
        assertEquals("1234", myAccount.getAccountNo());
    }

    @Test
    public void testThatMyAccountCanBeUpdated() {
    assertEquals("1234", myAccount.getAccountNo());
    myAccount.setFirstName("Estee");
    assertEquals("Estee", myAccount.getFirstName());
    myAccount.setLastName("Ikechukwu");
    assertEquals("Ikechukwu", myAccount.getLastName());
    }

    @Test
    public void testThatMyAccountCanUpdatePin() {
        myAccount.setPin("0000");
        assertEquals("0000", myAccount.getPin());
        myAccount.updatePin("0000", "2222");
        assertEquals("2222", myAccount.getPin());
    }

    @Test
    public void testThatUpdatePinThrowsExceptionWhenInvalidPinIsPassed() {
        myAccount.setPin("2222");
        assertEquals("2222", myAccount.getPin());
        assertThrows(InvalidAccountPinException.class, () -> {
            myAccount.updatePin("0000", "1001");
        });
    }

    @Test
    public void testThatMyAccountIs1000_whenIAdd1000() {
        myAccount.deposit(1000);
        assertEquals(1000, myAccount.checkBalance());
    }

    @Test
    public void testThatMyAccountIs6000_whenIAdd5000() {
        myAccount.deposit(1000);
        assertEquals(1000, myAccount.checkBalance());

        myAccount.deposit(5000);
        assertEquals(6000, myAccount.checkBalance());
    }

    @Test
    public void testThatDepositThrowsException_whenANegativeAmountIsPassed() {
        NegativeAmountException exception = assertThrows(NegativeAmountException.class, () -> {myAccount.deposit(-1);});
        assertEquals("Deposit amount must be greater than zero", exception.getMessage());
    }

    @Test
    public void testThatWhenIHave5000_iWithdraw1000_IHave4000() {
        myAccount.deposit(5000);
        assertEquals("0000", myAccount.getPin());

        myAccount.withdraw(1000, "0000");
        assertEquals(4000, myAccount.checkBalance());
    }

    @Test
    public void testThatWhenIHave5000_iWithdraw5000_IHaveZero(){
        myAccount.deposit(5000);
        assertEquals("0000", myAccount.getPin());

        myAccount.withdraw(1000, "0000");
        assertEquals(4000, myAccount.checkBalance());

        myAccount.withdraw(4000, "0000");
        assertEquals("0000", myAccount.getPin());
        assertEquals(0, myAccount.checkBalance());
    }

    @Test
    public void testThatWithdrawThrowsExceptionWhenAccountBalanceIsZero(){
        myAccount.deposit(5000);
        assertEquals("0000", myAccount.getPin());

        myAccount.withdraw(1000, "0000");
        assertEquals(4000, myAccount.checkBalance());

        myAccount.withdraw(4000, "0000");
        assertEquals("0000", myAccount.getPin());
        assertEquals(0, myAccount.checkBalance());

        assertThrows(NegativeAmountException.class, () -> myAccount.withdraw(-5000, "0000"));
    }

    @Test
    public void testThatWithdrawThrowsExceptionWhenAWrongPinIsPassed() {
        myAccount.deposit(5000);
        assertEquals(5000, myAccount.checkBalance());

        myAccount.withdraw(1000, "0000");
        assertEquals(4000, myAccount.checkBalance());

        assertThrows(InvalidAccountPinException.class, () -> {
           myAccount.withdraw(3000, "1111");
        });
    }

}
