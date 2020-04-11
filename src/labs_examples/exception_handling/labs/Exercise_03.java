package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 3:
 *
 *      Demonstrate a try/catch/finally block.
 *
 */
class Ex3 {
    public static void main(String[] args) {
        int [] num = {0,1,2,3};
        try {
            int x= num[4]/num[0];

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("first exception catching error");
        }catch (ArithmeticException e){
            System.out.println("second exception");
        }finally{
            System.out.println("this prints regardless");
        }
    }

}