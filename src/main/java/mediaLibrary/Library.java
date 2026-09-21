package mediaLibrary;

import java.util.ArrayList;

public class Library {

    private String owner;
    private ArrayList<Book> books;
    private ArrayList<Game> boardgames;
    private ArrayList<Movie> movies;

    public Library(String owner){
        this.owner = owner;
        books = new ArrayList<>();
        boardgames = new ArrayList<>();
        movies = new ArrayList<>();
    }

    public void addMovie(Movie m){
        movies.add(m);
    }

    public void addBook(Book b){
        books.add(b);
    }

    public void addGame(Game g){
        boardgames.add(g);
    }

    private String stringifyList(ArrayList<?> list, String category) {
        StringBuilder result = new StringBuilder(category + "\n");
        for (Object o : list) {
            result.append(o.toString()).append("\n");
        }
        return result.toString();
    }

    public String toString(){
        String result = owner + "'s Library: \n";
        result += stringifyList(books, "Books");
        result += stringifyList(boardgames, "Board Games");
        result += stringifyList(movies, "Movies");
        return result;
    }


}
