package detectiveStory;

public class DetectionPrinciple {

    public static void main(String[] args){

        Country usa = new Country("United States of America");
        Country uk = new Country("United Kingdom");
        Country spain = new Country("Spain");

        Amateur jbf = new Amateur("Jessica Fletcher", usa, "some street", "Cabot Cove");
        PrivateInvestigator dt = new PrivateInvestigator("Dick Tracy", usa, "Chicago");
        ProfessionalDetective rl = new ProfessionalDetective("Robert Lewis", uk, "Oxford");
        Amateur rc = new Amateur("Rick Castle", usa, "", "New York City");

        System.out.println("Detectives ...");
        System.out.println(jbf);
        System.out.println(dt);
        System.out.println(rl);
        System.out.println(rc);

        System.out.println("\nCountries before detectives are added ...");
        usa.printDetectives();
        uk.printDetectives();
        spain.printDetectives();

        usa.addDetective(jbf); usa.addDetective(dt); usa.addDetective(rc);
        uk.addDetective(rl);

        System.out.println("\nCountries after detectives are added ...");
        usa.printDetectives();
        uk.printDetectives();
        spain.printDetectives();
    }
}
