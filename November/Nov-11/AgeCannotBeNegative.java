public class AgeCannotBeNegative extends RuntimeException {
    public String getMessage() {
        return "Your age cannot be negative"; 
    }

    public String description() {
        return "It is an unchecked exception";
    }
}