package mediaLibrary;

public class Movie {
    private String title;
    private int year;
    private String length;

    public Movie(String title, int year, String length){
        this.title = title;
        this.year = year;
        this.length = length;
    }

    @Override
    public String toString(){
        return title + " (" + year + "-" + length + ")";
    }

}
