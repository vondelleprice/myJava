package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 4:
 *
 *      Demonstrate a nested try/catch.
 *
 */

class ex4{
    public static void main(String[] args) {
        try {


            try {
                double x = 2 / 0;
            } catch (ArithmeticException e) {
                System.out.println("error handled");
            }
        }catch (ArithmeticException e) {
            System.out.println("backup catch");
        }
    }

}