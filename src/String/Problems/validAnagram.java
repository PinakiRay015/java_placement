//java program to check whether two strings can be anagram or not....
package String.Problems;

import java.util.Arrays;

public class validAnagram {
    public static Boolean checkAnagram(String str1 , String str2)
    {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        char []str1Array = str1.toCharArray();
        char []str2Array = str2.toCharArray();

        if(str1Array.length == str2Array.length)
        {
            Arrays.sort(str1Array);
            Arrays.sort(str2Array);
            for(int i = 0 ; i<str1Array.length ; i++)
            {
                if(Arrays.equals(str1Array , str2Array))
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        String str1 = "anagram" , str2 = "nagaram";
        System.out.println(checkAnagram(str1 , str2));
    }
}
