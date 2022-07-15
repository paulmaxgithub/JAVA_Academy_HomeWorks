package home_work_1;

public class OperatorsPriorityTaskTwo {

    public static void main(String[] args) {

        int minCoefficient = 2;
        int maxCoefficient = 8;

        getIntegerResults(minCoefficient, maxCoefficient);
        getBooleanResults(minCoefficient);
    }

    private static void getIntegerResults(int minC, int maxC) {

        int[] integersArray = {};

        /* DESCRIPTION for '5 + minC / maxC'
        • first action result of 'minC / maxC' is 2 / 8 equals 0
        • second action result '5 + 0' equals 5
         */
        int intResult1 = 5 + minC / maxC;   // result = 5

        /* DESCRIPTION for '(5 + minC) / maxC'
         • first action result of '(5 + minC)' is 5 + 2 equals 7
         • second action result '7 / 8' equals 0
         */
        int intResult2 = (5 + minC) / maxC; // result = 0

        /* DESCRIPTION for '(5 + minC++) / maxC'
         • minC++ equals 2
         • first action result of '(5 + minC++)' is 5 + 2 equals 7
         • second action result '7 / 8' equals 0
         */
        int intResult3 = (5 + minC++) / maxC;   // result = 0

        /* DESCRIPTION for '(5 + minC++) / --maxC'
         • minC++ equals 2
         • first action result of '(5 + minC++)' is 5 + 2 equals 7
         • --maxC equals 7 -> (8 - 1)
         • second action result '7 / 7' equals 1
         */
        int intResult4 = (5 + minC++) / --maxC; // result = 1

        /* DESCRIPTION for '(5 * minC >> minC++) / --maxC'
        • minC++ equals 2
        • first action result of 'minC >> minC++' is '2(00000010) >> 2' equals 0
        • second action result of '5 * 0' equals 0
        • --maxC equals 7 -> (8 - 1)
        • third action '0 / 7' equals 0
         */
        int intResult5 = (5 * minC >> minC++) / --maxC; // result = 0

        /* DESCRIPTION for '(5 + 7 > 20 ? 68 : 22 * minC >> minC++) / --maxC'
        • first action result of '5 + 7 > 20' equals FALSE
        • compiler ask replace all expression with '22 * minC >> minC++'
        • FALSE matches right side of expression '22 * minC >> minC++'
        • minC++ equals 2
        • second action result of 'minC >> minC++' is '2(00000010) >> 2' equals 0
        • third action '22 * 0' equals 0
        • --maxC equals 7(8 - 1)
        • fourth action '0 / 7' equals 0
         */
        int intResult6 = (5 + 7 > 20 ? 68 : 22 * minC >> minC++) / --maxC;  // result = 0

        /* DESCRIPTION for '(5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> minC++) / --maxC'
        • the given expression contains an error
        • the right and left parts contain different types of values
        • the console immediately enters an error before compilation
         */
//              int intResult7 = (5 + 7 > 20 ? 68 >= 68 : 22 * 2 >> minC++) / --maxC; // error in debugger (console)

        //Add all int values to array
        integersArray = new int[]{intResult1,intResult2, intResult3, intResult4,intResult5, intResult6};

        //Print all array values
        for (int arrayValue : integersArray) {
            System.out.println(arrayValue);
        }
    }

    private static void getBooleanResults(int minC) {

        boolean[] booleansArray = {};

        /* DESCRIPTION for '6 - minC > 3 && 12 * 12 <= 119'
        • first action is result of right part '6 - 2 > 3' equals TRUE
        • second action is result of '12 * 12 <= 119' equals FALSE
        • expression of 'true && false' equals FALSE
         */
        boolean booleanValue1 = 6 - minC > 3 && 12 * 12 <= 119; // result = FALSE

        /* DESCRIPTION for 'true && false'
        • expression of 'true && false' equals FALSE
         */
        boolean booleanValue2 = true && false;  // result = FALSE

        //Add all int values to array
        booleansArray = new boolean[]{booleanValue1,booleanValue2};

        //Print all array values
        for (boolean arrayValue : booleansArray) {
            System.out.println(arrayValue);
        }
    }
}