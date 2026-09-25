package mediaLibrary;

import org.xml.sax.Attributes;
import org.xml.sax.helpers.DefaultHandler;

import java.util.ArrayList;

public class Exercise1Parser_Started extends DefaultHandler {

    // Global variables to store the values needed for Book objects
    private String bookAuthor;
    private String bookTitle;

    // Global ArrayList to store the Book objects
    private ArrayList<Book> booksInLibrary = new ArrayList<>();

    public void startElement(String uri, String localName, String qName, Attributes attributes) {
        if (qName.equals("book")) {
            // when the tag is a book tag, get the title and author!
            bookAuthor = attributes.getValue("author");
            bookTitle = attributes.getValue("title");
            // check your work! comment this out when you are certain
            // it's all good.
            System.out.println("Book title: " + bookTitle);
            System.out.println("Book author: " + bookAuthor);
        }
    }

    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("book")) {
            // build the book and add it to the arraylist!
            Book newBook = new Book(bookTitle,bookAuthor);
            booksInLibrary.add(newBook);

            // clear out the global variables
            bookTitle = "";
            bookAuthor = "";
        }
    }

    public void endDocument() {
        // when we're all done parsing, we need to print out the
        // books in the library
        System.out.println("Books in the Library: ");
        for (Book b : booksInLibrary) {
            System.out.println("   " + b);
        }
    }
}
