
/*

Please demonstrate Object association by creating at least two POJOs and a Controller class. The Controller
class will contain the main() method. In the main() create an object of each POJO you just created and associate
the two together. (This is easier than it sounds. Refer to the Object Association documentation if you're not sure.)


 */


public class Association {
    public static void main(String[] args) {
        Person myPerson =  new Person("VonDelle","P", 23);
        School mySchool = new School ( "Gmu", "Virginia");

        System.out.println("My name is: "+ myPerson.fName + myPerson.lName+ " and I am "+ myPerson.age+ "\n"+ "I went to: "+ mySchool.name+ " in "+ mySchool.state);




    }


}

class Person{
String fName;
String lName;
int age;

public Person (String fName, String lName, int age){
    this.fName=fName;
    this.lName=lName;
    this.age=age;

}

}

class School {
  String name;
  String state;


  public School(String name, String state) {
      this.name=name;
      this.state=state;


  }



}