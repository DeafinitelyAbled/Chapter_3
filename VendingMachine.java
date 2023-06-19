import java.util.Scanner;
import java.util.InputMismatchException;
public class VendingMachine {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        boolean askForInput = true;

        while (askForInput) {
            try {
                int input = scnr.nextInt();

                if ((input <= 0) || (input > 8)) {
                    throw new Exception("Try again, please");
                }

                System.out.println("Dispensing item " + input);
                askForInput = false;
            }
            catch (InputMismatchException e) {
                System.out.println("Fatal Error!");
                askForInput = false;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                askForInput = true;
            }
        }


    }

}