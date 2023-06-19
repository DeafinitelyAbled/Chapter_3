import java.util.Scanner;

public class StreamNumberExceptionHandler {
    public static void main(String[] args) {
        final int INDEX_FIRST_NAME = 0;
        final int INDEX_LAST_NAME = 1;
        final int INDEX_DEPARTMENT = 2;
        final int INDEX_SALARY = 3;
        final String SEPERATOR = ",";
        Scanner scnr = new Scanner(System.in);

        String[] inputField; 	// input-defined string to store in an array to split from each other using split().
        String inputRow;		// to get user defined input in row string
        int totalSalary = 0;
        int numberRow = 0;

        System.out.println("Please enter your first, last names, as well as occupancy and your earnings.");
        System.out.println("Please enter each input with a comma, but without seperating each");

        while (scnr.hasNext()) {
            inputRow = scnr.nextLine();
            ++numberRow;
            System.out.println(numberRow + ") " + inputRow);
            inputField = inputRow.split(SEPERATOR);

            try {
                totalSalary += Integer.parseInt(inputField[INDEX_SALARY]);
                System.out.println("Full Name: " +
                        inputField[INDEX_FIRST_NAME] + " " + inputField[INDEX_LAST_NAME]);
                System.out.println("Job and Salary: " +
                        inputField[INDEX_DEPARTMENT] + " " + inputField[INDEX_SALARY]);

            }
            catch (NumberFormatException e) {
                System.out.println("The salary entery for "
                        + inputField[INDEX_FIRST_NAME] + " " + inputField[INDEX_LAST_NAME]
                        + SEPERATOR + " " + inputField[INDEX_SALARY]
                        + ", is not an integer.\n"
                        + "This information won't be added in the list");
            }
        }

        System.out.println();
        System.out.printf("Total salaries: $%,8d", totalSalary);

    }
}
