package graphics;

public class GraphicTester {
    static void main() {
        Movable go = new GraphicObject(10, 10);
        System.out.println(go);

        go.moveTo(12, 15);
        System.out.println(go);

        Rectangle r = new Rectangle(20, -3, 10.0, 52.0);
        System.out.println(r);
        r.moveTo(5, 15);
        System.out.println(r);
    }
}
