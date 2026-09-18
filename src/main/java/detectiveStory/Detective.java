package detectiveStory;

public abstract class Detective {

    protected String name;
    protected Country ogCountry;

    public Detective(String name, Country ogCountry){
        this.name = name;
        this.ogCountry = ogCountry;

        ogCountry.addDetective(this);
    }

    public String name(){
        return name;
    }

}
