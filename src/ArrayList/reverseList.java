package ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class reverseList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        System.out.println("This is the normal List "+ list);

        Collections.reverse(list);

        System.out.println("This is the reversed List "+list);
    }
}
