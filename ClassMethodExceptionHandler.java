import java.util.Scanner;

public class ClassMethodExceptionHandler {
    public static double getPositiveValue(Scanner scnr, String valName)
            throws InvalidNegativeInputException {

        System.out.print("Enter " + valName + ": ");

        double inputVal = scnr.nextDouble();

        if (inputVal < 0.0) {
            throw new InvalidNegativeInputException(valName);
        }

        return inputVal;
    }

    public static double getDensity(Scanner scnr)
            throws InvalidNegativeInputException, NaNException {

        double massVal = getPositiveValue(scnr, "massVal");
        double volumeVal = getPositiveValue(scnr, "volumeVal");
        double densityCalc = massVal / volumeVal;

        if (Double.isNaN(densityCalc)) {
            throw new NaNException("densityCalc");
        }

        return densityCalc;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        try {
            System.out.println("Density: " + getDensity(scnr));
        }
        catch (InvalidNegativeInputException excpt) {
            System.out.println(excpt.getMessage());

            // Handle ...
        }
        catch (NaNException excpt) {
            System.out.println(excpt.getMessage());

            // Handle ...
        }
    }
}