package detectiveStory;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

public class TestParser extends DefaultHandler {
    public void startDocument() {
        System.out.println("Start of document");
    }

    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        System.out.println("Start of element: " + qName);
        for (int i = 0; i < attributes.getLength(); i++) {
            System.out.println("Attribute name: " + attributes.getLocalName(i) + ", value: " + attributes.getValue(i));
        }
    }

    public void characters(char[] ch, int start, int length) {
        System.out.println("Characters: " + new String(ch, start, length));
    }

    public void endElement(String uri, String localName, String qName) {
        System.out.println("End of element: " + qName);
    }

    public void endDocument() {
        System.out.println("End of document");
    }
}
