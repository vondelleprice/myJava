package labs_examples.input_output.labs;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.IOException;

/**
 * Input/Output Exercise 2: File encryption
 *
 *      -Using the BufferedReader, read a file character by character and write an encrypted version to a new file.
 *      -For example, change every 'a' to '-' and every 'e' to '~' .
 *      -Make sure you close the connections to both files.
 *
 *      Then, ead back the encrypted file using the BufferedReader and
 *      print out the unencrypted version. Does it match the original file?
 *
 */

class Ex2{
    public static void main(String[] args) {

            BufferedReader inputStream = null;
            PrintWriter outputStream = null;
            try {

                inputStream = new BufferedReader(new FileReader("/Users/vondelle/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/inputFile"));
                outputStream = new PrintWriter(new FileWriter("/Users/vondelle/Documents/CodingNomads/labs/online-java-fundamentals/src/labs_examples/input_output/labs/outputFile"));
                String l;

                while ((l = inputStream.readLine()) != null) {
                    l.replace('a','-');
                    l.replace('e','~');
                    outputStream.println(l);
                }
            } catch (IOException exc){
                System.out.println("An error occurred: " + exc.getMessage());
            } finally {
                // close connections
                try{
                    inputStream.close();
                } catch(IOException exc){
                    exc.printStackTrace();
                }
                outputStream.close();

            }
        }
    }
