package home_work_2.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArraysUtils {

    static private int validInteger;

    public static void main(String[] args) {

        //TODO: uncomment the code to execute program of task 2.1.1 and enter 'Run'
        System.out.println("TASK 2.1.1-----------------------------");
        int[] containerOne = arrayFromConsole();
        System.out.println("The current array received such values - "
                + Arrays.toString(containerOne));

        //TODO: uncomment the code to execute program of task 2.1.2 and enter 'Run'
        System.out.println("\nTASK 2.1.2-----------------------------");
        int[] containerTwo = arrayRandom(5, 100);
        System.out.println("The current array received such values - "
                + Arrays.toString(containerTwo));
    }


    //2.1.1
    //The method requests the size of the array and each of its elements via the console
    public static int[] arrayFromConsole() {
        int indexCounter = 0;
        int[] currentArray;
        boolean isValidNumber = false;


        /* request an array size number from the user */
        while (!isValidNumber) {
            Scanner console = new Scanner(System.in);
            System.out.println("Please, enter number of array size...");
            isValidNumber = checkValidNumber(console);
        }

        /* request an array numbers from the user */
        int index = validInteger;
        currentArray = new int[index];

        while (indexCounter < (index + 1)) {
            Scanner console = new Scanner(System.in);

            if (indexCounter == 0) {
                System.out.println("Please, enter " + validInteger + " numbers!");
                indexCounter++;
            }

            System.out.println("Please, enter number_" + indexCounter + " <-");

            isValidNumber = checkValidNumber(console);
            if (isValidNumber) {
                currentArray[indexCounter - 1] = validInteger;
                indexCounter++;
            }
        }
        return currentArray;
    }

    //2.1.2
    //The method requests the size of the array and the maximum random number via the console
    public static int[] arrayRandom(int size, int maxValueExclusion) {

        int indexCounter = 0;
        int[] currentArray = new int[size];
        Random random = new Random();

        while (indexCounter < size) {
            int currentIntRandomValue = random.nextInt(maxValueExclusion);
            currentArray[indexCounter] = currentIntRandomValue;
            indexCounter++;
        }
        return currentArray;
    }

    ///////////////////////////////////////
    //CUSTOM METHOD TO VALIDATE INT VALUE//
    ///////////////////////////////////////
    private static boolean checkValidNumber(Scanner console) {

        boolean isValid = false;

        if (console.hasNextInt()) {
            validInteger = console.nextInt();
            isValid = (validInteger != 0);
        } else {
            System.out.print("You've entered NOT value! ");
        }
        return isValid;
    }
}
