package home_work_2.loops;

public class Task_1_6 {

    public static void main(String[] args) {

        int startNumber;
        int multiplier = 1;
        int columnCounter;
        int rowLengthCount = 0;

        boolean isSecondPartOfTable = false;

        //for line alignment
        String equalsSymbol;
        String divideSymbol;

        StringBuilder stringResult = new StringBuilder();

        /* COLUMN */
        while (multiplier < 11) {

            //set default values for each new row
            startNumber = (isSecondPartOfTable) ? 6 : 2;
            columnCounter = 0;

            /* ROW */
            while (columnCounter < 4) {

                //work with string result
                equalsSymbol = (multiplier < 10) ? "  = " : " = ";
                divideSymbol = (startNumber * multiplier < 10) ? "  | " : " | ";
                if (startNumber == 5 || startNumber == 9) divideSymbol = "";

                //add string result with actual values according to conditions
                stringResult
                        .append(startNumber)
                        .append(" * ")
                        .append(multiplier)
                        .append(equalsSymbol)
                        .append(startNumber * multiplier)
                        .append(divideSymbol);

                if (startNumber == 5 || startNumber == 9) stringResult.append("\n");

                if (columnCounter == 0 && multiplier == 1) rowLengthCount = stringResult.length();

                //start create second part of table
                if (startNumber == 5 && multiplier == 10) {
                    stringResult.append(addDividingLine(rowLengthCount));
                    isSecondPartOfTable = true;
                    multiplier = 0;
                }

                startNumber++;
                columnCounter++;
            }

            multiplier++;
        }


        System.out.println(stringResult);
    }

    private static String addDividingLine(int rowLength) {

        StringBuilder lineResult = new StringBuilder();
        int increaseCounter = 0;

        rowLength = rowLength * 2 - 1;

        while (increaseCounter != rowLength) {
            if (increaseCounter == 6 || increaseCounter == 13 || increaseCounter == 20) {
                lineResult.append("+ ");
            } else {
                lineResult.append("— ");
            }
            increaseCounter++;
        }
        return lineResult + "\n";
    }
}
