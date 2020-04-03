package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("put in any word: ");
        String userInput = scanner.next();
       int count=0 ;
       boolean firstVowel=false;
       char letter='a';
        while (count < userInput.length() && !firstVowel ){
            char i= userInput.charAt(count);

            if (i=='a'|| i=='e' || i=='i' || i=='o' || i=='u'){
                firstVowel=true;
                letter=i;
            }
            count++;
        }
        System.out.println("word is: "+ userInput + " first vowel is: "+ letter);



    }





}
