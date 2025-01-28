package bankApp;

import java.util.ArrayList;

public class Bank {
    private String accountNumber;
    private ArrayList <Account> bankAccounts = new ArrayList<>();

    public Account createAccount(String firstName, String lastName, String pin) {
        int tempAccountNumber = 1234;
        int generatedNum = tempAccountNumber+1;
        this.accountNumber = String.valueOf(generatedNum);
        String newAccountNumberString = this.accountNumber;
        Account account = new Account(newAccountNumberString, pin, firstName, lastName, 0);
        checkValidity(firstName, lastName, pin);
        bankAccounts.add(account);
        return account;

    }

    private void checkValidity(String firstName, String lastName, String pin) {
        if(firstName == null || firstName.isBlank()){
            throw new IllegalArgumentException("First name cannot be empty");
        }
        if(lastName == null || lastName.isBlank()){
            throw new IllegalArgumentException("Last name cannot be empty");
        }
        if(pin == null || pin.isBlank()){
            throw new IllegalArgumentException("Pin cannot be empty");
        }
    }

    public void deposit(int amount, String accountNumber ) {
        Account account = findAccount(accountNumber);
        if(account != null) {
            if (amount > 0) {
                account.deposit(amount);
            }
            else {
                System.out.println("You cannot deposit amounts less than 0");}
        }
    }

    private Account findAccount(String accountNumber) {
        for (Account account : bankAccounts) {
            if (account.getAccountNo().equals(accountNumber)) {
                return account;
            }
            else System.out.println("Insufficient balance");
        }
        return null;
    }

    public String getBalance() {
        Account account = findAccount(this.accountNumber);
        assert account != null;
        return String.valueOf(account.checkBalance());
    }

    public void withdraw(int amount, String accountNumber ) {
        Account account = findAccount(accountNumber);
        if(account != null) {
            if(amount > 0 && amount < account.checkBalance()) {
               account.withdraw(amount, account.getPin());
            }else throw new NegativeAmountException("Insufficient Balance");
        }
        else throw new InvalidAccountPinException("Account number does not exist");

    }

    public void transfer(int amount, String fromAccountNumber, String toAccountNumber, String pin) {
        Account sender = findAccount(fromAccountNumber);
        Account receiver = findAccount(toAccountNumber);
        if(sender != null && receiver != null) {

        }
    }
}
