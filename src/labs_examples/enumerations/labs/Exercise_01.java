package labs_examples.enumerations.labs;

/**
 * Enumerations Exercise 1:
 *
 *      1) Create an enumeration. Use a controller class to demonstrate the use of the enum from a seperate class.
 *      2) Create a parameterized enumeration that passes one or more values to it's constructor. Demonstrate the use
 *      of this enum from a seperate class.
 */
class EnumEx1{
    public static void main(String[] args) {
    cardinalObject test1 = new cardinalObject(Cardinal.EAST);
     test1.location();
     Cardinal test2 = Cardinal.EAST;
     System.out.println("the furthest east on a typical map: "+ test2.getHost());
    System.out.println("using a different method to call the place: "+ test1.getPlace());
    }


}

class cardinalObject{
    Cardinal cardinal;
    String Place;

    public cardinalObject(Cardinal cardinal){
        this.cardinal=cardinal;
        setPlace();
    }

    public void setPlace(){
        this.Place= this.cardinal.getHost();
    }

    public String getPlace(){
        return this.Place;
    }

public void location(){
        switch (this.cardinal){
            case EAST:
                System.out.println("known for anime!");
                break;
            case WEST:
                System.out.println("known for hollywood!");
                break;
            default:
                System.out.println("Its cold!");
                break;
        }
}



}



