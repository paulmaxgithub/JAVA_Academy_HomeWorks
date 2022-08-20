package home_work_2.arrays;

public class ArraysIteration {

    public static void main(String[] args) {

        int[] currentArray = ArraysUtils.arrayFromConsole();
        printAllArrayElementsToConsole(currentArray);
        printEverySecondArrayElementToConsole(currentArray);
        printAllArrayElementsToConsoleInReverseOrder(currentArray);
    }

    //TODO: use - do....while, while, for, foreach

    /* TASK 2.2.1 */
    public static void printAllArrayElementsToConsole(int[] intArray) {
        System.out.println("/* TASK 2.2.1 */");
        int counter = 0;
        for (int element : intArray) {
            System.out.print(element);
            counter++;
            if (counter < intArray.length) {
                System.out.print(", ");
            } else {
                System.out.println("\n");
            }
        }
    }

    /* TASK 2.2.2 */
    public static void printEverySecondArrayElementToConsole(int[] intArray) {
        System.out.println("/* TASK 2.2.2 */");
        int counter = 0;
        while (counter < intArray.length) {
            if (counter % 2 != 0) {
                System.out.print(intArray[counter]);
                if (counter + 2 < intArray.length) System.out.print(", ");
            }
            counter++;
        }
        System.out.println("\n");
    }

    /* TASK 2.2.3 */
    public static void printAllArrayElementsToConsoleInReverseOrder(int[] intArray) {
        System.out.println("/* TASK 2.2.3 */");
        for (int index = intArray.length; index > 0; index--) {
            System.out.print(intArray[index - 1]);
            if ((index - 1) > 0) System.out.print(", ");
        }
    }
}
