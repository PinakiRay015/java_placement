//java program to check whether a String is palindrome or not in a BETTER way
package String.Problems;

public class checkPalindromeOPTIMIZED {
    public static boolean checkPalindrome(String str)
    {
        int length = str.length();
        for(int i = 0 ; i<str.length()/2 ; i++)
        {
            if(str.charAt(i) != str.charAt(length-1-i))
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        System.out.println(checkPalindrome(str));
    }
}
