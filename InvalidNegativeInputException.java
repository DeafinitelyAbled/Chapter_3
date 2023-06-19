public class InvalidNegativeInputException extends Exception {
    public InvalidNegativeInputException(String varName) {
        super("Variable " + varName + " is negative");
    }
}