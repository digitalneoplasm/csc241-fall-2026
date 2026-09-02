package graphics;

public class GraphicObject implements Movable{
    private int x;
    private int y;

    public GraphicObject(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
