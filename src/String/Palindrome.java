//Java program to check if a string is palindrome or not
package String;

public class Palindrome {
    public static boolean checkPalindrome(String str)
    {
        for(int i=0 ; i<str.length()/2 ; i++)
        {
            if(str.charAt(i) == str.charAt(str.length()-1-i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        String str = "race";
        System.out.println(checkPalindrome(str));
    }
}
