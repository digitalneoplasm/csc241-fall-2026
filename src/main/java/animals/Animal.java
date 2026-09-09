package animals;

public class Animal {
    // WE MUST FIX THIS ASAP!
    protected String name;
    private String description;

    public Animal(String name, String description){
        this.name = name;
        this.description = description;
    }

    public void eat(){
        // Do some things that result in full tummies!
    }

    public void die(){
        // Instructions for end of life.
    }
    public String toString(){
        return "Animal: " + description + "; named: " + name;
    }
}
