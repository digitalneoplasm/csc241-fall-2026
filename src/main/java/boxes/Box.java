package boxes;

import java.util.ArrayList;

public class Box {
    // State (instance variables)
    private double length;
    private double width;
    private double height;
    private String color;

    private ArrayList<Widget> widgets;

    // Constructor - gives value to instance variables.
    public Box(double length, double width, double height, String color) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.color = color;

        widgets = new ArrayList<>();
    }

    public double volume() {
        double vol = length * width * height;
        return vol;
    }

    public String toString() {
        String boxStuff = "length=" + length + " width=" + width + " height=" + height
                + " color=" + color + "\n";
        for (Widget w : widgets) {
            boxStuff = boxStuff + w.toString() + "\n";
        }
        return boxStuff;
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
    }
}
