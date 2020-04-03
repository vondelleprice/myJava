package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 2: Days of the week
 *
 *      Take in a number from the user and print "Monday", "Tuesday", ... "Sunday", or "Other"
 *      if the number from the user is 1, 2,... 7, or other respectively. Use a "nested-if" statement.
 *
 */

public class Exercise_02 {

    public static void main(String[] args) {

        // 1) create scanner (don't forget to import Scanner!)
        // 2) prompt user
        // 3) assign input to variable as int
        // 4) write completed code here


        Scanner scanner = new Scanner(System.in);

        System.out.print("type a number 1 through 7 ");

        int number = scanner.nextInt();

        if (number>0 && number <8){
            if (number==1){
                System.out.println("Sunday");
            }

            if (number==2){
                System.out.println("Monday");
            }

            if (number==3){
                System.out.println("Tuesday");
            }
            if (number==4){
                System.out.println("Wednesday");
            }
            if (number==5){
                System.out.println("Thursday");
            }
            if (number==6){
                System.out.println("Friday");
            }
            if (number==7){
                System.out.println("Saturday");
            }
        }
    }
}
