package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 5:
 *
 *      Demonstrate how to throw an exception.
 *
 */
class ex5{
    public static void main(String[] args) {
        try{
            method1();
        }catch(ArithmeticException e){
            System.out.println("got caught. finished here");
        }
    }
    public static double method1()throws ArithmeticException{
        try{
            double x= 2/0;
            return x;
        }catch (ArithmeticException e){
            System.out.println("its getting thrown back up");
            throw e;
        }
    }
}