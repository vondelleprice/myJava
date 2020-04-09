package labs_examples.objects_classes_methods.labs.oop.B_polymorphism;
/*
1) Demonstrate the three forms of Polymorphism:
    - Overloading
    - Overriding
    - Interfaces

2) Demonstrate the three forms of polymorphism again - but in a new set of classes. We want to lock this in.
Challenge yourself. Build something you're proud of.

3) Demonstrate using an interface as an instance variable - have a constructor that takes in the interface as a
parameter. Also have a setter that allows you to update the interface object. Through code, demonstrate that you
understand how we can use Interfaces as dependencies (instance variables) and how useful and flexible they make our
application.
 */
public class polymorphismEx {
    public static void main(String[] args) {
    Rectangle aRectangle = new Rectangle(10, 5);
    Square aSquare = new Square(9);


    myPolyMorphEx aPoly = new myPolyMorphEx(aRectangle);
    myPolyMorphEx aPoly2 = new myPolyMorphEx(aSquare);

    System.out.println("the area of the rectangle is: "+ aPoly.testPolygon());
    System.out.println("the area of the square is: "+ aPoly2.testPolygon());
    }

}

interface Polygon{
    public void calculateArea();
    public double getArea();

}

class Rectangle implements Polygon{
    private double length;
    private double width;
    private double area;
    //just something to use from the parent class, i couldn't think of a better idea but i understand all the concepts fine
    private final static int NUMSIDES=4;

    public Rectangle (){
        this.length=0;
        this.width=0;

    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea() {
        return area;
    }

    public void calculateArea() {
        this.area = this.length*this.width;
    }

    public static int getNUMSIDES() {
        return NUMSIDES;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", area=" + area +
                '}';
    }
}


class Square extends Rectangle{
    private double aSide;
    private double area;

    public Square(double aSide){
        super();
        this.aSide= aSide;

    }

    public double getaSide() {
        return aSide;
    }

    public void setaSide(double aSide) {
        this.aSide = aSide;
    }

    @Override
    public double getArea() {
        return area;
    }

    @Override
    public void calculateArea() {
        this.area = this.aSide*super.getNUMSIDES();
    }


    @Override
    public String toString() {
        return "Square{" +
                "aSide=" + aSide +
                ", area=" + area +
                '}';
    }
}

class myPolyMorphEx{
    Polygon polygon;

    public myPolyMorphEx(Polygon polygon){
        this.polygon=polygon;

    }
    public void setPolygon(Polygon polygon){
        this.polygon=polygon;
    }
    public double testPolygon(){
       polygon.calculateArea();
       return polygon.getArea();
    }

}








