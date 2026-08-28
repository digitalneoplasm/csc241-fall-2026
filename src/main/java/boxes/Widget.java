package boxes;

public class Widget {
    private String name;
    private double weight;
    private Box box;

    public Widget(String name, double weight, Box box) {
        this.name = name;
        this.weight = weight;
        this.box = box;

        box.addWidget(this);
    }

    public String toString() {
        return "name=" + name + " weight=" + weight;
    }



}
