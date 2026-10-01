package dataStructures;

public class Main {
    public static void main(String[] args){
        ExpandableArray arr = new ExpandableArray();
        arr.add("a");
        arr.add("b");
        System.out.println(arr);

        System.out.println(arr.get(0));
        System.out.println(arr.get(3));
    }

}
