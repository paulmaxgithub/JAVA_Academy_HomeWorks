package home_work_1;

public class MathLibraryTaskThree {

    public static void main(String[] args) {

        /*
        • The double value that is closer than any other to e,
        the base of the natural logarithms.
        • The double value that is closer than any other to pi,
        the ratio of the circumference of a circle to its diameter.
         */
        showFields();

        /*
        abs(double a), abs(float a), abs(int a), abs(long a)
        returns the absolute value of Int, Double, Long, Float
         */
        abs();

        /*
        • addExact(int x, int y) returns the sum of its arguments,
        throwing an exception if the result overflows an int.
        • addExact(long x, long y) returns the sum of its arguments,
        throwing an exception if the result overflows a long.
         */
        addExtract();

        /*
        cbrt(double a) returns the cube root of a double value
         */
        cbrt();

        /*
        cos(double a) returns the trigonometric cosine of an angle
         */
        cos();

        /*
        exp(double a) returns Euler's number e raised to the power of a double value
         */
        exp();

        /*
        log(double a) returns the natural logarithm (base e) of a double value
         */
        log();

        /*
        max(double a, double b) returns the greater of two double values
        max(float a, float b) returns the greater of two double values
        max(int a, int b) returns the greater of two int values
        max(long a, long b) returns the greater of two long values
         */
        max();

        /*
        min(double a, double b) returns the greater of two double values
        min(float a, float b) returns the greater of two double values
        min(int a, int b) returns the greater of two int values
        min(long a, long b) returns the greater of two long values
         */
        min();

        /*
        • multiplyExact(int x, int y) returns the product of the arguments,
        throwing an exception if the result overflows an int
        • multiplyExact(long x, long y) returns the product of the arguments,
        throwing an exception if the result overflows a long
        • multiplyExact(long x, int y) returns the product of the arguments,
        throwing an exception if the result overflows a long
         */
        multiplyExact();

        /*
        pow(double a, double b) returns the value of the first argument
        raised to the power of the second argument
         */
        pow();

        /*
        random() returns a double value with a positive sign,
        greater than or equal to 0.0 and less than 1.0.
         */
        random();

        /*
        rint(double a), rint(float a) return the double value that is closest in value
        to the argument and is equal to a mathematical integer
         */
        rint();

        /*
        round(double a), round(float a) return the closest long to the argument,
        with ties rounding to positive infinity
         */
        round();

        /*
        sin(double a) returns the trigonometric sine of an angle
         */
        sin();

        /*
        subtractExact(int x, int y), subtractExact(long x, long y)
        returns the difference of the arguments,
        throwing an exception if the result overflows an int
         */
        subtractExact();

        /*
        tan(double a) returns the trigonometric tangent of an angle
         */
        tan();

        /*
        toDegrees(double angrad) converts an angle measured in radians
        to an approximately equivalent angle measured in degrees
         */
        toDegrees();

        /*
	    toIntExact(long value) returns the value of the long argument;
	    throwing an exception if the value overflows an int
         */
        toIntExact();

        /*
	    toRadians(double angdeg) converts an angle measured in degrees
	    to an approximately equivalent angle measured in radians
         */
        toRadians();
    }

    private static void showFields() {
        System.out.println(Math.E);     // 2.718281828459045
        System.out.println(Math.PI);    // 3.141592653589793
    }

    private static void abs() {
        System.out.println(Math.abs(-21.8d));  // 21.8
        System.out.println(Math.abs(5.341f));  // 5.341
        System.out.println(Math.abs(-1));      // 1
        System.out.println(Math.abs(4532L));   // 4532
    }

    private static void addExtract() {
        System.out.println(Math.addExact(2, 57));           // 59
        System.out.println(Math.addExact(234L, 345987L));   // 346221
    }

    private static void cbrt() {
        System.out.println(Math.cbrt(123)); // 4.973189833268591
    }

    private static void cos() {
        System.out.println(Math.cos(7));   // 0.7539022543433046
    }

    private static void exp() {
        System.out.println(Math.exp(2));   // 7.38905609893065
    }

    private static void log() {
        System.out.println(Math.log(2));   // 0.6931471805599453
    }

    private static void max() {
        System.out.println(Math.max(123.0072347D, 7.23098456D));            // 123.0072347
        System.out.println(Math.max(12.7f, 30.8f));                         // 30.8
        System.out.println(Math.max(12, 47));                               // 47
        System.out.println(Math.max(91230126491239L, 77771231239123766L));  // 77771231239123766
    }

    private static void min() {
        System.out.println(Math.min(123.0072347D, 7.23098456D));            // 7.23098456
        System.out.println(Math.min(12.7f, 30.8f));                         // 12.7
        System.out.println(Math.min(12, 47));                               // 12
        System.out.println(Math.min(91230126491239L, 77771231239123766L));  // 91230126491239
    }

    private static void multiplyExact() {
        System.out.println(Math.multiplyExact(12, 2));                  // 24
        System.out.println(Math.multiplyExact(9812376123001923L, 2L));  // 19624752246003846
        System.out.println(Math.multiplyExact(1237612300192371L, 2));   // 2475224600384742
    }

    private static void pow() {
        System.out.println(Math.pow(2, 3)); // 8.0
    }

    private static void random() {
        System.out.println(Math.random());  //0.0...1.0
    }

    private static void rint() {
        System.out.println(Math.rint(123.7D));      // 124.0
        System.out.println(Math.rint(7.58904F));    // 8.0
    }

    private static void round() {
        System.out.println(Math.round(17777.765D));     // 17778
        System.out.println(Math.round(123.000765F));    // 123
    }

    private static void sin() {
        System.out.println(Math.sin(2));   // 0.9092974268256817
    }

    private static void subtractExact() {
        System.out.println(Math.subtractExact(1000, 9));        // 991
        System.out.println(Math.subtractExact(1000999L, 1L));   // 1000998
    }

    private static void tan() {
        System.out.println(Math.tan(90));   // -1.995200412208242
    }

    private static void toDegrees() {
        System.out.println(Math.toDegrees(2D));  // 114.59155902616465
    }

    private static void toIntExact() {
        System.out.println(Math.toIntExact(2123898345L)); // 2123898345
    }

    private static void toRadians() {
        System.out.println(Math.toRadians(2D));  // 0.03490658503988659
    }
}
