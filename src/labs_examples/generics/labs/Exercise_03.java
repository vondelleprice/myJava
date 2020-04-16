package labs_examples.generics.labs;

/**
 * Generics Exercise 3:
 *
 *      1) Write a generic method that accepts two generic arguments. This generic method should only accept
 *      arguments which are sublasses of Number. The generic method must return the sum (as a double) of whatever two
 *      numbers were passed in regardless of their type.
 *
 *      2) Write a generic method to count the number of elements in a "Collection" of Strings that are palindromes

 *      3) Write a generic method to exchange the positions of two different elements in an array.
 *
 *      4) Write a generic method to find the largest element within the range (begin, end) of a list.
 *
 */

class Exercise3{
    public static void main(String[] args) {
        System.out.print(genMethod(900,50.15));
    }

public static <E extends Number, T extends Number> double genMethod(E num1, T num2){
   double sum=0;
        sum= num1.doubleValue() + num2.doubleValue();
        return sum;

}




}

