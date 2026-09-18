package detectiveStory;

public class PrivateInvestigator extends ProfessionalDetective{

    public PrivateInvestigator(String name, Country country, String town){
        super(name, country, town);
        rank = "P.I.";
    }

    @Override
    public String toString(){
        return name + ", a private investigator in " + town + ", " + ogCountry;
    }
}
