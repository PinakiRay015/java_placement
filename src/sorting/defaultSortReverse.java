//java program to perform reverse sorting by using default sorting method
package sorting;

import java.util.Arrays;
import java.util.Collections;

public class defaultSortReverse {
    public static void main(String[] args) {
        Integer []array = {3 , 1 , 44 , 12 , 54 , 22 , 4};
        Arrays.sort(array , Collections.reverseOrder());
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
