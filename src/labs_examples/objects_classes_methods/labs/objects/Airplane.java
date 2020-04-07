package labs_examples.objects_classes_methods.labs.objects;
/*
Following the example in CarExample.java, please use Object Composition to model an Airplane class.
The Airplane class must be composed of at least 4 other classes (as well as any primitive types you'd like).
The Airplane class itself should have a fuel capacity (double) variable, as well as a currentFuelLevel variable.
 */


class AirplaneExample{
    public static void main(String[] args) {
    AirplaneEngine myEngine= new AirplaneEngine(2500);
    Company myCompany= new Company("VonDelle Plane");
    Size mySize= new Size("very big");
    Style myStyle= new Style("luxury plane");

    Airplane myAirplane= new Airplane (myEngine,myCompany,mySize,myStyle,2000,1700);
    System.out.println(myAirplane.toString());
    System.out.println("the fuel capacity is: "+ myAirplane.fuelCapacity+ "Current amount of fuel: "+ myAirplane.currentFuelLevel);
    }

}


class Airplane {
    AirplaneEngine engine;
    Company company;
    Size size;
    Style style;
    double fuelCapacity;
    double currentFuelLevel;

    public Airplane(AirplaneEngine e, Company c, Size size, Style s, double fuelCapacity, double currentFuelLevel ) {
        this.engine=e;
        this.company=c;
        this.size=size;
        this.style=s;
        this.fuelCapacity=fuelCapacity;
        this.currentFuelLevel=currentFuelLevel;
    }
    public String toString(){
        return engine.toString()+ company.toString()+ size.toString()+ style.toString();
    }


}

class AirplaneEngine{
    double power;

    public AirplaneEngine(double x){
        this.power=x;
    }

    public String toString() {
        return "The amount power this engine output is: "+ this.power;
    }
}

class Company{
    String companyName;

    public Company(String c){
        this.companyName= c;
    }

    public String toString(){
        return "||The company that created the plan is: "+ this.companyName;
    }
}

class Size {
    String size;

    public Size(String s) {
        this.size = s;
    }

    public String toString()

    {
       return "||The size of the plan is: " + this.size;
    }
}

class Style {
    String style;

    public Style (String s){
        this.style=s;
    }
    public String toString() {
       return "||The style of the plan is: " + this.style;
    }
}


