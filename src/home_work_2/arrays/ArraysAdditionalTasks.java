package home_work_2.arrays;

import java.util.Arrays;

public class ArraysAdditionalTasks {

    public static void main(String[] args) {

        int[] currentArray = ArraysUtils.arrayRandom(50,100);
        getSumOfEvenPositiveArrayElements(currentArray);
        getMaximumElementFromArrayWithEvenIndexes(currentArray);
        getAllArrayElementsThatAreLessThanArithmeticMean(currentArray);
        findTwoMinElementsOfArray(currentArray);
        removeElementsBelongingToInterval(currentArray);
        getSumOfArrayDigits(currentArray);
    }

    /* TASK 2.4.1 */
    private static void getSumOfEvenPositiveArrayElements(int[] intArray) {
        int sumResult = 0;
        int counter = 0;
        for (int element : intArray) {
            if (element % 2 == 0) {
                sumResult += element;
                counter++;
            }
        }

        //Display Result Into Console
        System.out.println("/* TASK 2.4.1 */");
        System.out.print("Found " + counter + " Items. ");
        System.out.println("Sum Of Even Positive Elements = " + sumResult);
        System.out.println("——————————————————————————————————————————————————————");
    }

    /* TASK 2.4.2 */
    private static void getMaximumElementFromArrayWithEvenIndexes(int[] intArray) {
        int currentMaxValue = 0;
        for (int index = 0; index < intArray.length; index++) {
            if (index != 0 && index % 2 == 0) {
                if (intArray[index] > currentMaxValue) {
                    currentMaxValue = intArray[index];
                }
            }
        }

        //Display Result Into Console
        System.out.println("/* TASK 2.4.2 */");
        System.out.println("Max Element From Array With Even Indexes = " + currentMaxValue);
        System.out.println("——————————————————————————————————————————————————————");
    }

    /* TASK 2.4.3 */
    private static void getAllArrayElementsThatAreLessThanArithmeticMean(int[] intArray) {
        int arithmeticMean = 0;
        for (int element : intArray) arithmeticMean += element;
        arithmeticMean /= intArray.length;

        //Display Result Into Console
        System.out.println("/* TASK 2.4.3 */");
        System.out.println("Elements That Are Less Than Arithmetic Mean - ");
        for (int element : intArray) {
            if (element < arithmeticMean) {
                System.out.print(element + " ");
            }
        }
        System.out.println(" ");
        System.out.println("——————————————————————————————————————————————————————");
    }

    /* TASK 2.4.4 */
    private static void findTwoMinElementsOfArray(int[] intArray) {
        int numOne = intArray[0];
        int numTwo = intArray[1];

        for (int element : intArray) {
            if (element < numOne) {
                numOne = element;
            } else if (element < numTwo) {
                numTwo = element;
            }
        }

        //Display Result Into Console
        System.out.println("/* TASK 2.4.4 */");
        System.out.println("Two Min Elements Of Array - " + numOne + ", " + numTwo);
        System.out.println("——————————————————————————————————————————————————————");
    }

    /* TASK 2.4.5 */
    private static void removeElementsBelongingToInterval(int[] intArray) {

        // interval of numbers to be excluded from the array
        int lowerArrayBound = 30; int upperArrayBound = 70;

        for (int i = 0, j = 1; i < intArray.length; i++, j++) {

            if (intArray[i] > lowerArrayBound && intArray[i] < upperArrayBound || intArray[i] == 0) {
                int currentIndex = i; int next = j;
                while (next < intArray.length) {
                    intArray[currentIndex] = intArray[next];
                    next++;
                    currentIndex++;
                }
                intArray[intArray.length - 1] = 0;
            }

            // check if new value of current i into interval
            if (intArray[i] > lowerArrayBound && intArray[i] < upperArrayBound) {
                i--;
                j--;
            }
        }

        //Display Result Into Console
        System.out.println("/* TASK 2.4.5 */");
        System.out.println("The result of the executed algorithm looks like this");
        System.out.println(Arrays.toString(intArray));
        System.out.println("——————————————————————————————————————————————————————");
    }

    /* TASK 2.4.6 */
    private static void getSumOfArrayDigits(int[] intArray) {

        int result = 0;

        for (int element : intArray) {
            if (element / 10 == 0) {
                result += element;
            } else {
                do {
                    result += element % 10;
                    element /= 10;
                }
                while (element > 0);
            }
        }

        //Display Result Into Console
        System.out.println("/* TASK 2.4.6 */");
        System.out.println("the sum of all digits from the array numbers = " + result);
    }
}
