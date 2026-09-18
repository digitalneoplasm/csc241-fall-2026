package detectiveStory;

public class ProfessionalDetective extends Detective{

    protected String rank;
    protected String organization;
    protected String town;

    public ProfessionalDetective(String name, Country ogCountry, String town) {
        super(name, ogCountry);
        this.town = town;
    }

    public ProfessionalDetective(String name, Country ogCountry) {
        super(name, ogCountry);
    }

    public void specifyTown(String town){
        this.town = town;
    }

    public void specifyOrganization(String organization){
        this.organization = organization;
    }

    public void specifyRank(String rank){
        this.rank = rank;
    }

    @Override
    public String toString(){
        return name + ", a profession detective working in " + town + ", " + ogCountry;
    }
}
