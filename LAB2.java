import java.util.Scanner;

/*
 * Given an array of 10 names, complete the main method that outputs the name specified by
 * the array index entered by the user. Use a try block to output the name and a catch block
 * to catch any ArrayIndexOutOfBoundsException.
 * Output the message from the exception object if an ArrayIndexOutOfBoundsException is caught.
 * Output the first element in the array if the index is negative or the last element if
 * the index is greater than the size of the array.
 *
 * Hint: Format the exception outputs using the getMessage() method from the exception object.
 * Do not hard code the exception messages.
 *
 * Example, if the input of the program is: 5
 * Name: Jane
 *
 * Example, if the input of the program is: 12
 * Exception! Index 12 out of bounds for length 10
 * The closest name is: Johnny
 */

public class LAB2 {

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        String[] names = {
                "Ryley", "Edan", "Reagan", "Henry", "Caius", "Jane", "Guto", "Sonya", "Tyrese", "Johnny"
        };
        int index;

        index = scnr.nextInt();
        /* Type your code here. */
        try {
            if ((index >= 0) && (index <= 9)) {
                System.out.println("Name: " + names[index]);
            }
            else if (index < 0) {
                throw new Exception("Exception! Index " + index + " out of bounds for length 10\n");
            }
            else {
                throw new Exception("Exception! Index " + index + " out of bounds for length 10\n");
            }
        }
        catch (Exception e) {
            System.out.print(e.getMessage());
            if (index < 0) {
                System.out.println("The closest name is: " + names[0]);
            }
            if (index > 9) {
                System.out.println("The closest name is: " + names[9]);
            }
        }

    }

}