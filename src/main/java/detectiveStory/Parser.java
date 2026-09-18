package detectiveStory;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

/*
2 patterns:
1) <tag attr="" ... > ... </tag>
  Strategy was to store the tag data from startElement, so we could use it (with everything else inside)
  at the endElement.
2) <tag>Text Data</tag>
  Global boolean flags set at the startElement, so we knew where the character data was located.
 */

/*
Plan: (Goal: get the list of detectives)
x Add a list of Country objects to my parser.
x Add a search method to look through the Country list for the one with a given name.
x Add a getName method to Country
x Add a list of Detective objects to my parser.
- In endElement, add the logic to find a country if it exists, build it if it doesn't, theb build our
  detective and add it to the list.
 */

public class Parser extends DefaultHandler {
    // Lists of countries and detectives
    private ArrayList<Country> countries = new ArrayList<>();
    private ArrayList<Detective> detectives = new ArrayList<>();

    // Temporary storage for data from the XML file
    private String detectiveType;
    private String detectiveName;
    private String detectiveStreet;
    private String detectiveTown;
    private String detectiveCountryName;

    // Temporary flags for tracking progress
    private boolean readingName = false;
    private boolean readingCountry = false;

    public void startDocument() {
        //System.out.println("Start of document");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("detective")) {
            detectiveType = attributes.getValue("type");
            //System.out.println("Detective start, type = " + detectiveType);
        }
        if (qName.equals("name")) {
            readingName = true;
            //System.out.println("Reading name.");
        }
        if (qName.equals("country")) {
            readingCountry = true;
            //System.out.println("Reading name.");
        }
        if (qName.equals("address")) {
            detectiveStreet = attributes.getValue("street");
            detectiveTown = attributes.getValue("town");
            //System.out.println("Detective start, type = " + detectiveType);
        }

//
//
//        System.out.println("Start of element: " + qName);
//        for (int i = 0; i < attributes.getLength(); i++) {
//            System.out.println("Attribute name: " + attributes.getLocalName(i) + ", value: " + attributes.getValue(i));
//        }
    }

    public void characters(char[] ch, int start, int length) {
        if (readingName) {
            detectiveName = new String(ch, start, length);
        }
        if (readingCountry) {
            detectiveCountryName = new String(ch, start, length);
        }
        //System.out.println("Characters: " + new String(ch, start, length));
    }

    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("detective")) {
//            System.out.println("Detective:");
//            System.out.println("Name: " + detectiveName);
//            System.out.println("Type: " + detectiveType);
//            System.out.println("Street: " + detectiveStreet);
//            System.out.println("Town: " + detectiveTown);
//            System.out.println("Country Name: " + detectiveCountryName);

            int countryIndex = getCountryIndex(detectiveCountryName);
            Country country;
            if (countryIndex >= 0) {
                country = countries.get(countryIndex);
            }
            else {
                country = new Country(detectiveCountryName);
                countries.add(country);
            }

            // Build the detective
            if (detectiveType.equals("amateur")) {
                detectives.add(new Amateur(detectiveName, country, detectiveStreet, detectiveTown));
            }
            else if (detectiveType.equals("private")) {
                detectives.add(new PrivateInvestigator(detectiveName, country, detectiveTown));
            }
            else if (detectiveType.equals("professional")) {
                detectives.add(new ProfessionalDetective(detectiveName, country, detectiveTown));
            }

            detectiveName = "";
            detectiveType = "";
            detectiveStreet = "";
            detectiveTown = "";
            detectiveCountryName = "";
        }
        if (qName.equals("name")) {
            readingName = false;
            //System.out.println("Done reading name. (" + detectiveName + ")");
        }
        if (qName.equals("country")) {
            readingCountry = false;
            //System.out.println("Done reading name. (" + detectiveName + ")");
        }
        //System.out.println("End of element: " + qName);
    }

    public void endDocument() {
        //System.out.println("End of document");
        System.out.println("Detectives: ");
        for (Detective detective : detectives) {
            System.out.println(detective);
        }

        System.out.println("\n\nCountries");
        for (Country country : countries) {
            country.printDetectives();
        }
    }

    private int getCountryIndex(String countryName) {
        for (int i = 0; i < countries.size(); i++) {
            if (countryName.equals(countries.get(i).getName())) {
                return i;
            }
        }
        return -1;
    }
}
