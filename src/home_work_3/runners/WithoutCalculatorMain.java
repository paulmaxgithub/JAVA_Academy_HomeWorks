package home_work_3.runners;

public class WithoutCalculatorMain {

    private static double result;

    public static void main(String[] args) {

        /*
        GET RESULT FROM 4.1 + 15 * 7 + (28 / 5) ^ 2
         */

        // STEP 1. - (28 / 5)
        result = divide(28, 5d);
        // STEP 2. - result of STEP 1. ^ 2
        result = exponentiate(result, 2);
        // STEP 3. - 15 * 7
        double x = multiply(15, 7);
        // STEP 4. - (15 * 7) + (28 / 5) ^ 2
        result = add(result, x);
        // STEP 5. - result of STEP 4. + 4.1
        result = add(result, 4.1);

        //SHOW RESULT
        System.out.println(round(result, 2));
    }

    private static double add(double a, double b) { return a + b; }

    private static double multiply(double a, double b) { return a * b; }

    private static double divide(double a, double b) { return a / b; }

    private static double exponentiate(double number, int exp) { return (int)number ^ exp ; }

    /**
     * <li><code>The link below describes the problem and suggests a solution</code>
     * <br><br>
     * https://stackoverflow.com/questions/322749/retain-precision
     -with-double-in-java#:~:text=Add%20a%20comment-,173,-As%20others%20have
     */
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }
}