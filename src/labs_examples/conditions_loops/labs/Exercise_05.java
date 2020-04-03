package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("enter lower bound ");

        int number1 = scanner.nextInt();

        System.out.print("enter higher bound ");

        int number2 = scanner.nextInt();

        double sum=0;

        int count=0;

        for (int i = number1; i <= number2; i++){
            sum +=i;
            count++;
        }

        double avg= sum/count;

        System.out.println("The lower bound is: " + number1 + " higher bound is: " + number2 +
                " Sum is: " + sum + " Average: " + avg);









    }



}
