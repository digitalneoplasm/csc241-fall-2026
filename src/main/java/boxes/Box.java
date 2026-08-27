package boxes;

public class Box {
    // State (instance variables)
    private double length;
    private double width;
    private double height;
    private String color;

    // Constructor - gives value to instance variables.
    public Box(double length, double width, double height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double volume() {
        double vol = length * width * height;
        return vol;
    }
}
