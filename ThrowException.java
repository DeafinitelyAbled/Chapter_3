import java.util.Scanner;
import java.util.InputMismatchException;

public class ThrowException {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double calculation = 0;
        double input1;
        double input2;

        try {
            calculation = scnr.nextDouble() / scnr.nextDouble();

            if (Double.isNaN(calculation)) {
                throw new Exception("The inputs are invalid!");
            }

            System.out.println("The calculation of first input division by the second input is: " + calculation);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());

        }
    }
}
