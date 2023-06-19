import java.util.Scanner;
import java.util.InputMismatchException;

/*
 *Write a program that reads integers userNum and divNum as input, and
 *output the quotient (userNum divided by divNum). Use a try block to perform the statements.
 *Use a catch block to catch any ArithmeticException and output an exception message with
 *the getMessage() method. Use another catch block to catch any InputMismatchException and
 *output an exception message with the toString() method.
 *
 *Note: ArithmeticException is thrown when a division by zero happens.
 *InputMismatchException is thrown when a user enters a value of different data type
 *than what is defined in the program. Do not include code to throw any exception in the program.
 *
 *Example, if the input of the program is: 15 3
 *		   the output of the program is: 5
 *
 *Example, if the input of the program is: 10 0
 *		   the output of the program is: Arithmetic Exception: / by zero
 *
 *Example, if the input of the program is: 15.5 5
 *		   the output of the program is: Input Mismatch Exception: java.util.InputMismatchException
 */

public class Lab3 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        int userNum, divNum;

        try {
            userNum = scnr.nextInt();
            divNum = scnr.nextInt();

            System.out.println(userNum / divNum);
        }
        catch (ArithmeticException d) {
            System.out.println("Arithmetic Exception: " + d.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Input Mismatch Exception: " + e.toString());

        }

    }

}