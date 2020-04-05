package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args) {
        int nums [] = new int[10];
        double sum= 0;

        for (int i=0; i<10; i++){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter any number");
            int random = scanner.nextInt();

            nums[i] = random;
            sum+= random;
        }

        double avg=sum/10;

        for (int j=0;j<10;j++){
            System.out.println(nums[j]);
        }

        System.out.println("The sum is: "+ sum);
        System.out.println("The sum is: "+ avg);





    }
}