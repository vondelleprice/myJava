package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 1:
 *
 *      1) Demonstrate a try/catch.
 *
 */

class Ex1 {
    public static void main(String[] args) {
        try{
            double x= 2/0;
        }catch(ArithmeticException e){
            System.out.println("error handled");
        }
    }
}