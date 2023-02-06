package sorting;

import java.util.Arrays;

public class defaultSort {
    public static void main(String[] args) {
        int []array = {4 , 2 , 2};
        Arrays.sort(array);
        for(int i=0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
