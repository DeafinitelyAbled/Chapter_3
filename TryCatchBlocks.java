import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchBlocks {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int input;

        System.out.print("Enter an integer: ");

        try {
            input = scnr.nextInt();
        }
        catch (InputMismatchException e) {
            System.out.println("Invalid input!");
        }


    }
}