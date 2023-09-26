//java program to sort the arraylist
package ArrayList;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<5 ; i++)
        {
            myArray.add(sc.nextInt());
        }

        System.out.println("Array before sorting :-"+myArray);
        Collections.sort(myArray);
        System.out.println("Array after sorting :-"+myArray);
    }
}
