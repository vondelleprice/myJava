package labs_examples.objects_classes_methods.labs.oop.A_inheritance;
/*
1) Create at least 5 classes that demonstrate an labs_examples.inheritance hierachy. The depth of the hiearchy must be at least 3. Meaning:
A extends B, B extends C. Classes A, B, and C define an labs_examples.inheritance hierachy with a depth of 3. Create a real-world
labs_examples.inheritance hierarchy. For instance you could create an labs_examples.inheritance hiearchy using animals, or food, or the solar system,
or stores, restaurants, adventures, and really anything else you can imagine. Have some fun with it. Try to challenge
yourself.

2) Once you've created this hierarchy, demonstrate the use of non-default constructors in the parent classes. Meaning,
use the super(arg1, arg2, ...) command from a subclass to invoke a parameterized constructor in the parent class. Do this
at least once, several times over would be better.

3) Create at least three methods that override a method in one or more parent classes.

4) Create a controller class/method that will create objects of your hiearchy and demonstrate how you use this labs_examples.inheritance
hiearchy. Demonstrate that your subclasses have set the variables in the parent classes, that you have called the parameterized
super constructors from sub-classes, that you are indeed overriding methods.

 */
public class inheritanceEx1 {
    public static void main(String[] args) {
    student ex= new student(180,60,23,"vondelle","price","gmu",2019);
    System.out.println(ex.toString());
    }
}

class human {
    private double weight;
    private double height;
    private int age;

    public human(double w, double h, int age){
        this.weight=w;
        this.weight=h;
        this.age=age;

    }



    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String toString(){
        return "This persons physical characteristics:\nWeight: "+this.weight+ "\nHeight: "+this.height+ "\nAge: "+this.age;

    }

}

class citizen extends human{
    private String fname;
    private String lname;

    public citizen(double w, double h, int age, String fname, String lname){
        super(w,h,age);
        this.fname=fname;
        this.lname=lname;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }
    public String toString() {
        return super.toString() + "\nThe person's full legal name is: "+ this.fname+ this.lname;
    }
}

class student extends citizen{
    private String school;
    private int gradYear;

    public student(double w, double h, int age, String fname, String lname, String school, int gradYear){
        super(w,h,age,fname,lname);
        this.school=school;
        this.gradYear=gradYear;
    }


    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getGradYear() {
        return gradYear;
    }

    public void setGradYear(int gradYear) {
        this.gradYear = gradYear;
    }

    public String toString() {
        return super.toString()+ "\n"+ this.getFname()+ " also is/was a student. His/her school: "+ this.school + " Graduation year: "+ this.gradYear;

    }
}



