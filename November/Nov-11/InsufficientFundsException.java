public class InsufficientFundsException extends RuntimeException {
    public String getMessage() {
        return "Insufficient funds";
    }
}