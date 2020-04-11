package labs_examples.exception_handling.labs;

/**
 * Exception Handling Exercise 7:
 *
 *      1) Create a custom exception.
 *      2) Demonstrate a method throwing your custom exception.
 */

class customExeception1 extends Exception{
 public String toString(){
     return "custom exception called";
 }
}

class customException2{
    public static void main(String[] args) {
    try{
        checkNum(15);
    }catch (customExeception1 e){
       System.out.println(e.toString());
    }
    }
public static double checkNum(double x) throws customExeception1{
    if (x>20){
        return x;
    } else {
        throw new customExeception1();
    }
}

}