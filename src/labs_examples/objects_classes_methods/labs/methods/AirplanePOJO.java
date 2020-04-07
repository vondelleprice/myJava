package labs_examples.objects_classes_methods.labs.methods;
/*
For each POJO you created to complete the previous Airplane exercise, please change all the instance variables in each
class to "private". Then, create getter and setter methods (for each instance variable) in each class you created for
the airplane exercise. Also, create a toString() method in each POJO. Once complete, demonstrate getting and setting
those variables from the class in which you composed the Airplane object, as well as invoking their toString() methods
 */
public class AirplanePOJO {
    public static void main(String[] args) {
        Airplanes ex =  new Airplanes();
        ex.setName("Emerites");
        ex.setColor("blue");
        ex.setAge(15);
        System.out.println("Name: "+ ex.getName()+ " Color: "+ ex.getColor()+ " Age: "+ ex.getAge());
        Airplanes ex2 =  new Airplanes();
        ex2.setName("United");
        ex2.setColor("orange");
        ex2.setAge(20);
        System.out.println(ex2.toString());

    }
}

class Airplanes{
    private String name;
    private String color;
    private int age;

    public String getName(){return this.name;}
    public String getColor() { return this.color;}
    public int getAge() {return this.age;}

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Airplanes{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}


