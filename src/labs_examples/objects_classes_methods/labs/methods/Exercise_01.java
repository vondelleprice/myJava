package labs_examples.objects_classes_methods.labs.methods;

/**
 * Created by ryandesmond - https://codingnomads.co
 */
public class Exercise_01 {

    public static void main(String[] args) {

        // please create the methods as instructed below then
        // call each of those methods from here, within the main()
    System.out.println(multiply(10,5));
    System.out.println(divide(10,5));
    joke();
    System.out.println(varargsCount("test","one","two"));


    }


    // 1) Create a static multiply() method below that takes two int arguments (int a, int b) and
    //    returns the result of a * b
        public static int multiply(int a, int b){
        int answer = a*b;

        return answer;
        }

    // 2) Create a static divide() method below that takes two int arguments (int a, int b) and
    //    returns the result of a / b
        public static int divide(int a, int b) {
        int answer = a/b;
        return answer;
        }

    // 3) Create a static void method that will print of joke of your choice to the console
        public static void joke(){
        System.out.println("why does cough and dough not rhyme BUT pony and bologna does??? english dont make sense.");

        }

    // 4) Create a static method that takes in a number in years (int years) as an argument
    //    and returns the number of seconds that number in years represents
    public static double yearsToSeconds(int years){
        double seconds= years*365*24*60*60;

        return seconds;

    }

    // 5) Create a varargs method that will return the length of the varargs array passed in
public static int varargsCount(String...v){
        int count=0;
        for(String word: v){
            count++;
        }

        return count;

}





}
