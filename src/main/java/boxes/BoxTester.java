package boxes;

public class BoxTester {
    static void main() {
        Box box1 = new Box(2,3,4,"red");
        System.out.println(box1.toString());
        System.out.println("Box 1 volume: " + box1.volume());

//        Box box2 = new Box(-3,3,4,"red");
//        System.out.println(box2.toString());
//        System.out.println("Box 2 volume: " + box2.volume());

        Widget widget1 = new Widget("Laptop", 4.5, box1);
        Widget widget2 = new Widget("Thingamabob", 5.3, box1);

        System.out.println(box1);
    }
}
