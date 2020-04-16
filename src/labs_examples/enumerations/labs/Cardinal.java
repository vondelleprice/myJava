package labs_examples.enumerations.labs;

public enum Cardinal {
    NORTH("The North Pole"),SOUTH("antartica"),EAST("Japan"),WEST("California");

    private String host;
    Cardinal(String host) {
    this.host=host;
    }

    public String getHost(){
        return this.host;
    }




}
