package detectiveStory;

public class Amateur extends Detective {
    private String streetAddress;
    private String town;

    public Amateur(String name, Country country, String streetAddress, String town){
        super(name,country);
        this.streetAddress = streetAddress;
        this.town = town;
    }

    @Override
    public String toString(){
        return name + ", an amateur sleuth who lives in " + town + ", in " +  ogCountry;
    }
}
