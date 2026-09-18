package detectiveStory;

import javax.xml.parsers.SAXParserFactory;

public class DetectiveParser {
    static void main() {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            spf.newSAXParser().parse("detectives.xml", new Parser());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
