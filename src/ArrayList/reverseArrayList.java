//java program to reverse an array list
package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class reverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> myArray = new ArrayList<>();
        for(int i=0 ; i<5 ; i++)
        {
            myArray.add(sc.nextInt());
        }

        System.out.println("Array before reversing :- "+myArray);
        Collections.reverse(myArray);
        System.out.println("Array after reversing :- "+myArray);
    }
}
