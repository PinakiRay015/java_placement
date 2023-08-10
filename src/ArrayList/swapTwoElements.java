//java program to swap two numbers of two given index positions of an Array List
package ArrayList;

import java.util.ArrayList;

public class swapTwoElements {
    public static ArrayList<Integer> swap(ArrayList<Integer>array , int index1 , int index2)
    {
        int temp = array.get(index1);
        array.set(index1 , array.get(index2));
        array.set(index2 , temp);
        return array;
    }
    public static void main(String[] args) {
        ArrayList<Integer>myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(40);

        int index1 = 1;
        int index2 = 3;

        System.out.println(myList);
        System.out.println(swap(myList , index1 , index2));

    }
}
