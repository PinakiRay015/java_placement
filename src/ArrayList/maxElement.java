package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class maxElement {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer> myArray = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        for(int i=0 ; i<5 ; i++)
        {
            myArray.add(sc.nextInt());
            max = Math.max(myArray.get(i), max);
        }

        System.out.println(myArray);
        System.out.println("The largest element of the array is "+max);
    }
}
