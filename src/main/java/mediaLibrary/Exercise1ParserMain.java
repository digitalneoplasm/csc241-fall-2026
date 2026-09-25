package mediaLibrary;

import javax.xml.parsers.SAXParserFactory;

public class Exercise1ParserMain {
    static void main() {
        SAXParserFactory spf = SAXParserFactory.newInstance();
        try {
            spf.newSAXParser().parse("mediaLibrary.xml", new Exercise1Parser_Started());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
