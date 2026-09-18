package detectiveStory;

import java.util.ArrayList;

public class Country {

    private String name;
    private ArrayList<Detective> detectivesPresent;

    public Country(String name){
        this.name = name;
        detectivesPresent = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){
        return name;
    }
    public void addDetective(Detective d){
        detectivesPresent.add(d);
    }

    public void printDetectives(){
        if(detectivesPresent.size() == 0){
            System.out.println("Detectives and sleuths found in " + name + ": none");
        } else {
            String words = "Detectives and sleuths found in " + name + ":\n     " + detectivesPresent.get(0).name();
            for (int i = 1; i < detectivesPresent.size(); i = i + 1) {
                words = words + "\n     " + detectivesPresent.get(i).name();
            }
            System.out.println(words);
        }
    }
}
