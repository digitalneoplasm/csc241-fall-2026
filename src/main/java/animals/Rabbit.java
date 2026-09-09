package animals;

public class Rabbit extends Animal {

    private boolean isLongHaired;

    public Rabbit(String n, String descrip, boolean isLongHaired){
        super(n,descrip);
        this.isLongHaired = isLongHaired;
    }

    @Override
    public String toString(){
        return "Elizabeth's favorite animal! A rabbit named " + name + " who is wonderful!!";
    }

}
