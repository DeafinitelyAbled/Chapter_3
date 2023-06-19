import java.util.Scanner;
import java.util.InputMismatchException;
public class RestaurantLimitSize {
    public static void main(String[] args) {
        //----------------------------------------------------------------
        Scanner scnr = new Scanner(System.in);
        int limit = 10;
        int occupied = 0;
        //----------------------------------------------------------------
        while (occupied < limit) {
            try {
                occupied = scnr.nextInt() + occupied;

                if (occupied < 0) {
                    occupied = 0;
                    System.out.println("Currently occupied: " + occupied);
                }
                else {
                    System.out.println("Currently occupied: " + occupied);
                }
            }
            catch (InputMismatchException e) {
                scnr.next();
            }
        }
        //----------------------------------------------------------------
        System.out.println("The restaurant is full!");

    }

}