package dataStructures;

public class LinkedList<E> {

    private Node<E> head;
    private int size;

    public LinkedList() {
        size = 0;
    }

    public void addFirst(E element) {
        Node<E> newNode = new Node(element, head);
        head = newNode;
        size++;
    }

    // Version 1
//    public String toString() {
//        String result = "";
//
//        // Track two things:
//        int i = 0;
//        Node<E> currentNode = head;
//
//        while (i < size) {
//            result += currentNode.data + " ";
//            i++;
//            currentNode = currentNode.next;
//        }
//        return result;
//    }

    public String toString() {
        String result = "";

        for (Node<E> current = head; current != null; current = current.next) {
            result += current.data + " ";
        }

        return result;
    }

    /**
     * Gets the data at the provided index in the list.
     * Throws IndexOutOfBoundsException for invalid indices.
     * @param i Index of the data in the list.
     * @return The data found in the list at the given index.
     */
    public E get(int i) {
        Node<E> importantNode = getNodeAtIndex(i);
        return importantNode.data;
//        // I can be from 0 to size-1.
//        if (i >= 0 && i <= size-1) {
//            // Track two things:
//            int j = 0;
//            Node<E> currentNode = head;
//
//            while (j < i) {
//                j++;
//                currentNode = currentNode.next;
//            }
//            return currentNode.data;
//        }
//        throw new IndexOutOfBoundsException();
    }

    /**
     *
     * @param i
     * @return
     */
    private Node<E> getNodeAtIndex(int i){
        // I can be from 0 to size-1.
        if (i >= 0 && i <= size-1) {
            // Track two things:
            int j = 0;
            Node<E> currentNode = head;

            while (j < i) {
                j++;
                currentNode = currentNode.next;
            }
            return currentNode;
        }
        throw new IndexOutOfBoundsException();
    }

    // 2 kinds of nested classes
    // 1) static inner class - can only access static members of the enclosing class.
    // 2) inner class - relies on the state of the 'this' instance of the outer class.
    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data, Node<E> next){
            this.data = data;
            this.next = next;
        }
    }
}
