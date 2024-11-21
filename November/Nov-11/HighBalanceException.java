public class HighBalanceException extends Exception {
    public String getMessage() {
        return "You balance is very high";
    }
}