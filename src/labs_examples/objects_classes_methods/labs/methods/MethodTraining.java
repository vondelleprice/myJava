package labs_examples.objects_classes_methods.labs.methods;
import java.awt.image.BufferedImage;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Font;
import java.util.ArrayList;

/*
2) Demonstrate the difference between "pass by value" and "pass by reference"

    3) Create a method that will return the largest of 4 numbers (all of which are passed in as arguments)

    4) Write a method to count all consonants (the opposite of vowels) in a String

    5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)

    6) Write a method that will determine whether or not a number is prime

    7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
            which is passed in as an argument

    8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
        In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
        divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
        length of the returned list


    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array

 */




public class MethodTraining {
    public static void main(String[] args) {
    int a= 1;
    int b=3;
    int c= 5;
    int d= 9;
    int [] numArray= {4,2,8,6};
    //2.pass by value
    largestNum(a,c,b,d);
    //2.pass by reference
    largestNum(numArray);
    // 4) Write a method to count all consonants (the opposite of vowels) in a String
    consonantsCount("Vondelle");
    //5) Write a method that will print some kind of ascii art to the console (Google "ascii art" if needed)
    artExample();
    //6) Write a method that will determine whether or not a number is prime
    primeNums(27);
    primeNums(181);
    // 7) Write a method that will return a small array containing the highest and lowest numbers in a given numeric array,
        //which is passed in as an argument
    int [] nums= {7,35,15,4,8,10};
    int [] differentArray=lowAndHighest(nums);
    System.out.println("The highest number is: " +differentArray[0]+ " The lowest number is: "+ differentArray[1]);

    /*8) Write a method that takes 3 arguments (int maxNum, int divisor1, int divisor2) and returns an Integer Arraylist.
      In this method create an Integer ArrayList and populate it with each number between zero and maxNum that is
      divisible by both divisor1 and divisor2. Then return this ArrayList. After calling this method, print out the
      length of the returned list
 */
    ArrayList <Integer> list1 = partEight(24,2,3);
    System.out.println("The length of the ArrayList is: " +list1.size());

    /*
    9) Write a method that will reverse an array in place use only one extra temp variable. For this exercise you cannot
        instantiate a second array. You must reverse the array in place using only one extra temp variable. Hint: this
        variable is used to temporarily store individual values in the array
     */
    int[] reversingArray= {9,8,7,6,5,4};
    reverseArray(reversingArray);
        for (int i: reversingArray){
            System.out.println(i);
        }

    }

    public static void reverseArray(int[] a){

        int temp;

        for(int i = 0; i < a.length / 2; i++) {

            temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }

    }

    public static ArrayList<Integer> partEight(int maxNum, int divisor1, int divisor2){
        ArrayList<Integer> list= new ArrayList<>();
        for (int i=0; i < maxNum; i++){
            if ((i%divisor1==0) && (i%divisor2==0)){
                list.add(i);
            }
        }
        return list;
    }

    public static int [] lowAndHighest(int[]nums){
        int highest=0;
        int lowest =0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]>highest){
                highest=nums[i];
            }

            if (i==0){
                lowest=nums[i];
            }
            if (nums[i]<lowest){
                lowest=nums[i];
            }

        }
        int [] highestLowest = {highest,lowest};
        return highestLowest;

    }

    public static void largestNum(int...nums){
        int highest=0;
        for (int n: nums){
            if (n>highest){
                highest=n;
            }
        }
        System.out.println("The highest number out of the four numbers is: "+ highest);

    }

    public static void consonantsCount(String a){
        int count=0;

        for (int i=0; i<a.length();i++){
            char letter= a.charAt(i);
            if ((letter != 'a') && (letter != 'e') && (letter != 'i') && (letter != 'o') && (letter != 'u')){
                count++;
            }
        }
        System.out.println("The number of consonants in this string is: "+ count);

    }
    public static void artExample (){
        int width = 100;
        int height = 30;

        //BufferedImage image = ImageIO.read(new File("/Users/mkyong/Desktop/logo.jpg"));
        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics g = image.getGraphics();
        g.setFont(new Font("SansSerif", Font.BOLD, 24));

        Graphics2D graphics = (Graphics2D) g;
        graphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING,
                RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        graphics.drawString("JAVA", 10, 20);

        //save this image
        //ImageIO.write(image, "png", new File("/users/mkyong/ascii-art.png"));

        for (int y = 0; y < height; y++) {
            StringBuilder sb = new StringBuilder();
            for (int x = 0; x < width; x++) {

                sb.append(image.getRGB(x, y) == -16777216 ? " " : "$");

            }

            if (sb.toString().trim().isEmpty()) {
                continue;
            }

            System.out.println(sb);
        }
    }

    public static void primeNums(int num){
        boolean isPrime= true;

        for (int i=2;i<num;i++){
            if (num%i==0){
                isPrime=false;
                break;
            }
        }
        if (isPrime){
            System.out.println("The number is prime");
        }else{
            System.out.println("The number is not prime");
        }
    }












}
