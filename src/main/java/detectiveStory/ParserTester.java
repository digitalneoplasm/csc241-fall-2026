package detectiveStory;

import javax.xml.parsers.SAXParserFactory;

public class ParserTester {
    static void main() {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            spf.newSAXParser().parse("detectives.xml", new TestParser());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
