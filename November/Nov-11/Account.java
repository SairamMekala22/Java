public class Account {
    static int initialAccountNumber = 231252;
    int accountNumber;
    float balance;
    String holderName;
    
    Account(String accountHolderName) {
        accountNumber = initialAccountNumber;
        initialAccountNumber++;
        this.holderName = accountHolderName;
    }
    
    Account(String accountHolderName, float balance) {
        this(accountHolderName);
        this.balance = balance;
    }
    
    float withdraw(float amount) {
        if (amount > balance) {
            throw new InsufficientFundsException();
        }
        balance -= amount;
        System.out.println("Withdrawl success");
        System.out.println("Your current balance: " + this.balance);
        return balance;
    }
    
    float deposit(float amount) throws HighBalanceException{
        if (amount > 20000) {
            throw new HighBalanceException();
        }
        balance += amount;
        System.out.println("Deposit successfull.");
        System.out.println("Your current balance: " + this.balance);
        return balance;
    }
    
    float getBalance() {
        return balance;
    }
}