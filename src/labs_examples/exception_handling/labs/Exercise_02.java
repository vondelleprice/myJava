package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 2:
 *
 *      Demonstrate a try/catch with multiple catch statements.
 *
 */

class Ex2 {
    public static void main(String[] args) {
        int [] num = {0,1,2,3};
        try {
            int x= num[4]/num[0];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("first exception catching error");
        }catch (ArithmeticException e){
            System.out.println("second exception");
        }
    }

}
