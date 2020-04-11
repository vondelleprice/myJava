package labs_examples.static_nonstatic.labs;
/*
Please create two classes that demonstrate the following:

1) A static method calling another static method in the same class
2) A static method calling a non-static method in the same class
3) A static method calling a static method in another class
4) A static method calling a non-static method in another class
5) A non-static method calling a non-static method in the same class
6) A non-static method calling a non-static method in another class
7) A non-static method calling a static method in the same class
8) A non-static method calling a static method in another class

 */


public class StaticNonStatic {
    public static void main(String[] args) {
    //number 1
        staticMethod();
        //number 3
        MethodTest.diffClassStatic();
        //number 4
        MethodTest obj = new MethodTest();
        obj.methodB();

    }
public static void staticMethod(){
        System.out.println("static method calling in same class");
}
public void nonStatic1() {
// number 5
        nonStatic2();
    //number 6
        MethodTest obj = new MethodTest();
    obj.methodB();
      //number 7
    staticMethod();
    //number
    MethodTest.diffClassStatic();
}
public void nonStatic2(){
        System.out.println("a non static class being called");
}


}


class MethodTest{
    public static void methodA(){

        MethodTest obj = new MethodTest();
        //number 2
        obj.methodB();
    }
    public void methodB(){
        System.out.println("Inside methodB");
    }
    public static void diffClassStatic (){
        System.out.println("static in a different class");
    }
}


