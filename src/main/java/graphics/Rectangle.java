package graphics;

public class Rectangle extends GraphicObject{
    private double length;
    private double width;

    public Rectangle(int x, int y, double length, double width) {
        super(x,y);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle: " + length + " x " + width + " at " + super.toString();
    }

}
