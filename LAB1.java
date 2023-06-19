import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * The given program reads a list of single-word first names and ages (ending with -1),
 * and outputs that list with the age incremented. The program fails and throws an exception
 * if the second input on a line is a String rather than an Integer. At FIXME in the code,
 * add a try/catch statement to catch java.util.InputMismatchException, and output 0 for the age.
 *
 * Example input:
 * Lee 18
 * Lua 21
 * Mary Beth 19
 * Stu 33
 * -1
 *
 * Example output:
 * Lee 19
 * Lua 22
 * Mary 0
 * Stu 34
 */

public class LAB1 {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String inputName;
        int age;

        inputName = scnr.next();
        while (!inputName.equals("-1")) {
            // FIXME: The following line will throw an InputMismatchException.
            // Insert a try/catch statement to catch the exception.
            try {
                age = scnr.nextInt();
                System.out.println(inputName + " " + (age + 1));
            }
            catch (InputMismatchException e) {
                System.out.print(inputName + " 0");
                scnr.nextLine();
                System.out.println();
            }
            inputName = scnr.next();
        }
    }
}