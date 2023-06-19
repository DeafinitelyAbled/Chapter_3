import java.util.Scanner;
import java.util.InputMismatchException;

public class MultipleExceptionHandler {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double circleArea;
        double circleRadius;

        System.out.print("Enter area: ");

        try {
            circleArea = scnr.nextDouble();

            if (circleArea < 0) {
                throw new Exception("Invalid area.");
            }

            circleRadius = Math.sqrt(circleArea / Math.PI);
            System.out.println(circleRadius);
        }
        catch (InputMismatchException excpt) {
            System.out.println("Invalid input.");
        }
        catch (Exception excpt) {
            System.out.println(excpt.getMessage());
        }

    }
}
