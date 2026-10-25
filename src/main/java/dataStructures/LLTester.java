package dataStructures;

public class LLTester {

    static void main() {
        LinkedList<String> ll = new LinkedList<>();

        ll.addFirst("rabbit");
        ll.addFirst("dog");
        ll.addFirst("cat");
        ll.addFirst("chicken");

        System.out.println(ll);

        System.out.println("Should be dog ... " + ll.get(2));
        //System.out.println("Get the node ..." + ll.getNodeAtIndex(2)); // doesn't work! yay!
    }
}
