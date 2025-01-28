package bankApp;

public class Account {
    private final String accountNo;
    private String pin;
    private String firstName;
    private String lastName;
    private int balance;
    private boolean isEmpty;

    public Account(String accountNo, String pin, String firstName, String lastName, int balance) {
        this.accountNo = accountNo;
        this.pin = pin;
        this.firstName = firstName;
        this.lastName = lastName;
        this.balance = balance;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public boolean isEmpty() {
        this.isEmpty = true;
        return true;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public void updatePin(String OldPin, String newPin) {
        if(this.pin.equals(OldPin)) {
            this.pin = newPin;
        }
        else throw new InvalidAccountPinException("Old pin is incorrect");
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int checkBalance() {
        if(pin.equals(pin)) {
            return balance;
        }
        else throw new IllegalArgumentException("Incorrect pin");
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        }
        else throw new NegativeAmountException("Deposit amount must be greater than zero");
    }

    public void withdraw(int amount, String pin) {
        if(this.pin.equals(pin)) {
            if (amount > 0 && balance >= amount) {
                this.balance -= amount;
            }
            else throw new NegativeAmountException("Insufficient Balance");
        }
        else throw new InvalidAccountPinException("Incorrect pin! Try again");
    }


}
