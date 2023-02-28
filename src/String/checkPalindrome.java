//java program to check a String is palindrome or not
package String;

import java.util.Scanner;

public class checkPalindrome {
    public static void checkString(String str)
    {
        String revStr = "";
        int length = str.length();
        for(int i = length-1 ; i>=0 ; i--)
        {
            revStr += str.charAt(i);
        }
        System.out.println((revStr.equals(str) ? "yes" : "no"));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the text");
        String str = sc.nextLine();
        checkString(str);
    }
}
