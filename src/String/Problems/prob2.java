//java program to perform valid anagram
package String.Problems;
import java.util.Arrays;

public class prob2 {
    public static Boolean validAnagram(String str1 , String str2)
    {
        str1.toLowerCase();
        str2.toLowerCase();
       char[] str1_arr = str1.toCharArray();
       char[] str2_arr = str2.toCharArray();
       Arrays.sort(str1_arr);
       Arrays.sort(str2_arr);

       for(int i=0 ; i<str1_arr.length ; i++)
       {
           if(Arrays.equals(str2_arr , str1_arr))
           {
               return true;
           }
       }
        return false;
    }
    public static void main(String[] args) {
        String str1 = "race";
        String str2 = "care";
        System.out.println(validAnagram(str1 , str2));
    }
}
