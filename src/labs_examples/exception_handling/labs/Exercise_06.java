package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 6:
 *
 *      Demonstrate throwing an exception in one method and catching it in another method.
 *
 */

class ex6{
    public static void main(String[] args) {
        try{
            method1();
        }catch(ArithmeticException e){
            System.out.println("got caught. finished here");
        }
    }
    public static void method1() throws ArithmeticException{
        System.out.println("first method to be called");
        method2();
    }
    public static double method2()throws ArithmeticException{
        try{
            double x= 2/0;
            return x;
        }catch (ArithmeticException e){
            System.out.println("its getting thrown back up");
            throw e;
        }
    }
}