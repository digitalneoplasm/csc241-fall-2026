package mediaLibrary;

public class Game {
    private String title;

    public Game(String title){
        this.title = title;
    }

    @Override
    public String toString(){
        return title + " (board game)";
    }
}
