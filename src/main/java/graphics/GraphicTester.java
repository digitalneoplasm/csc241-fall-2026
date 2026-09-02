package graphics;

public class GraphicTester {
    static void main() {
        Movable go = new GraphicObject(10, 10);
        System.out.println(go);

        go.moveTo(12, 15);
        System.out.println(go);
    }
}
