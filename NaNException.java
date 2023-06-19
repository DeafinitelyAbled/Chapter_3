public class NaNException extends Exception {
    public NaNException(String varName) {
        super("Variable " + varName + " is NaN");
    }
}