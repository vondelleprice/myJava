package labs_examples.generics.labs;

/**
 * Generics Exercise 1:
 *
 *      1.) Write a generic class with at least two instance variables, a constructor, and getter and setter methods.
 *      2.) Create a few objects of your generic class with different data types to demonstrate it's
 *          dynamic usage.
 */

class GenericEx1{
    public static void main(String[] args) {
    genericTest<String,String> obj = new genericTest<>("My name is VonDelle","I am 23 years old");
    System.out.print(obj.toString());

    PersonTest personTest= new PersonTest("vonDelle", "price", 23);

    genericTest<PersonTest,String> obj1 = new genericTest<>(personTest,". I am Vondelle ");
    System.out.print(obj1.toString());

    }
}

class genericTest <T,U>{
    private T obj1;
    private U obj2;

    genericTest(T obj1, U obj2){
        this.obj1=obj1;
        this.obj2=obj2;

    }

    public T getObj1() {
        return obj1;
    }

    public void setObj1(T obj1) {
        this.obj1 = obj1;
    }

    public U getObj2() {
        return obj2;
    }

    public void setObj2(U obj2) {
        this.obj2 = obj2;
    }

    @Override
    public String toString() {
        return "genericTest{ " +
                "obj1= " + obj1 +
                ", obj2= " + obj2 +
                '}';
    }
}