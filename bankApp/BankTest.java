package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankTest {
    private Bank myBank;

    @BeforeEach
    public void startWith() {
        myBank = new Bank();
    }

    @Test
    public void testThatAccountCanBeCreated() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        assertEquals("Esther", response.getFirstName());
    }

    @Test
    public void testThatMyBankThrowsExceptionForInvalidFirstName() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        assertThrows(IllegalArgumentException.class, () -> myBank.createAccount("", "Ikechukwu", "1234"));

    }

    @Test
    public void testThatMyBankThrowsExceptionForInvalidLastName() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        assertThrows(IllegalArgumentException.class, () -> myBank.createAccount("Esther", "", "1234"));
    }

    @Test
    public void testThatMyBankThrowsExceptionForInvalidPin() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        assertThrows(IllegalArgumentException.class, () -> myBank.createAccount("Esther", "Ikechukwu", ""));
    }

    @Test
    public void testThatMyBankCanDepositMoney() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        String accountNumber = response.getAccountNo();
        System.out.println(accountNumber);
        assertEquals("Esther", response.getFirstName());

        myBank.deposit(5000, accountNumber);
        assertEquals("5000", myBank.getBalance());
    }

    @Test
    public void testThatMyBankCanWithdrawMoney() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "0000");
        String accountNumber = response.getAccountNo();
        System.out.println(accountNumber);

        myBank.deposit(5000, accountNumber);
        assertEquals("5000", myBank.getBalance());

        myBank.withdraw(4000, accountNumber);
        assertEquals("1000", myBank.getBalance());
    }

    @Test
    public void testThatMyBankCanCheckBalance() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        String accountNumber = response.getAccountNo();
        System.out.println(accountNumber);

        myBank.deposit(5000, accountNumber);
        assertEquals("5000", myBank.getBalance());
    }

    @Test
    public void testThatWhenMyAccountHasMoney_iCanTransferMoneyFromMyBank_toAnotherBank() {
        Account response = myBank.createAccount("Esther", "Ikechukwu", "1234");
        String accountNumber = response.getAccountNo();
        myBank.deposit(5000, accountNumber);

        myBank.transfer(4000, accountNumber, "Ikechukwu", "1234");
    }


}
