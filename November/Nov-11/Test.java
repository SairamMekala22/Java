public class Test {
    public static void main(String[] args) throws HighBalanceException {
        Account seeta = new Account("Alex", 2000);
        Account geetha = new Account("Deeksh", 7000);
        
        // Seeta borrows from Geetha
        float borrowAmount = 0;
        try {
            borrowAmount = geetha.withdraw(2000);
            seeta.deposit(2000);
        } catch (Exception err) {
            err.getMessage();
        }
        
        // Seetha returns to geetha
        try {
            float returnAmount = borrowAmount * 10;
            seeta.withdraw(returnAmount);
            geetha.deposit(returnAmount);
        } catch (Exception err) {
            err.getMessage();
        }
        
        System.out.println("Seetha's balance: " + seeta.getBalance());
        System.out.println("Geetha's balance: " + geetha.getBalance());
    }
}