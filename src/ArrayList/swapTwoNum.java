//java program of swapping two elements of different indexes of an array list
package ArrayList;

import java.util.*;

public class swapTwoNum {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();

        myArray.add(10);
        myArray.add(20);
        myArray.add(30);
        myArray.add(40);

        System.out.println("Array list before swapping of first and last index :- "+myArray);

        //swapping the first index and last index of an array list
        myArray.set(0 , myArray.get(myArray.size()-1));
        myArray.set(myArray.size()-1 , myArray.get(0));


        System.out.println("Array list after swapping of first and last index :- "+myArray);
    }
}
