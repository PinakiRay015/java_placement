//Java program to find the largest element in an Array list
package ArrayList;

import java.util.ArrayList;

public class findMax {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(70);
        list.add(30);
        list.add(40);

        int max = Integer.MIN_VALUE;
        for(int i=0 ; i<list.size() ; i++)
        {
            max = Math.max(max , list.get(i));
        }

        System.out.println("The maximum element in my List is "+max);
    }
}
