package dataStructures;

public class Main {
    public static void main(String[] args){
        ExpandableArray<String> arr = new ExpandableArray<>();
        arr.add("a");
        arr.add("b");
        System.out.println(arr);

        System.out.println(arr.get(0));
        //System.out.println(arr.get(3));

        System.out.println("====\nAdding 100 Items\n====");
        ExpandableArray<Integer> iArr = new ExpandableArray<>();
        System.out.println(arr);
        for (int i = 0; i < 100; i++) {
            iArr.add(i);
            System.out.println(iArr);
        }

        for (String s : arr) {
            System.out.println(s);
        }
    }

}
