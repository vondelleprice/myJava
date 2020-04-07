
/*
For this exercise please create two classes. The first class is the controller and it will contain the main() method.
The second class is a POJO. Just a simple object type class that defines an object. In this POJO, demonstrate
at least three overloaded constructors. In the main() method, create at least 3 objects of your POJO class, each using
a different constructor. */


public class OverloadConstructors {
    public static void main(String[] args) {
        Person1 myPerson =  new Person1("VonDelle","P", 23);
        Person1 myPerson1 = new Person1("John","Doe");
        Person1 myPerson2 = new Person1(35);



    }

}

class Person1{
    String fName;
    String lName;
    int age;

    public Person1 (String fName, String lName, int age){
        this.fName=fName;
        this.lName=lName;
        this.age=age;

    }
    public Person1 (String fName,String lName){
        this.fName=fName;
        this.lName=lName;

    }

    public Person1 (int age){
        this.age=age;

    }



}




