/*
 * This class is our model of ArrayLists, called ExpandableArray.
 * Our goal is to create a list structure that has the pros of arrays,
 * without the cons.
 *
 * This program has RIDICULOUS amounts of comments, to take notes on our
 * thought process and help you remember why we wrote code as we did.
 * Don't write this many comments in your code!
 */
package dataStructures;

public class ExpandableArray {
    // state
    private String[] data; // elements in the ExpandableArray
    private int count; // number of elements in the EA

    // constructor
    public ExpandableArray(){
        // we have to give instance variables value ...
        // how big do we want data to be to start with?
        data = new String[10]; // we voted to hold 10 items, initially
        count = 0;
    }


    // behavior/desired functionality ...
    // add
    public void add(String s){
        // What does add have to do?
        // Find the first empty spot, and then stick s in it.  But
        // also update the count!
        // Fortunately, count will always tell us where to put things -- assuming that
        // we do not allow for empty spots.
        // BUT WHAT IF THERE'S NO ROOM?
        //if(we need more space) { expandArray(); }
        if(count == data.length) {
            expandArray();
        }
        // and then ...
        data[count] = s;
        count++;

        // if we are worried that the count is wrong, we might choose to handle
        // this possibility by having an outer selection statement to throw an
        // error...

    }

    private void expandArray() {
        // make a new array, twice the length of data
        String[] tempArray = new String[data.length*2];
        // copy data over
        for(int i = 0; i < count; i = i + 1){
            tempArray[i] = data[i];
        }
        // bind data to the new array
        data = tempArray;
    }


    // toString
    //
    @Override
    public String toString() {
        String result = "[";
        for (int i = 0; i < count; i++) {
            result = result + data[i];
            if (i != count - 1) {
                result = result + ", ";
            }
        }
        return result + "]";
    }

    public String get(int i) {
        if (i >= 0 && i < count) {
            return data[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }



}
