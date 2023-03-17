//java program to check whether a given string is palindrome or not
package String.Problems;

public class validPalindrome {
    public static Boolean checkPalindrome(String str)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i = 0 ; i<str.length() ; i++)
        {
            if(Character.isDigit(str.charAt(i)) || Character.isLetter(str.charAt(i)))
            {
                sb.append(Character.toLowerCase(str.charAt(i)));
            }
        }

        for(int i=0 ; i<sb.length()/2 ; i++)
        {
            if(sb.charAt(i) == sb.charAt(sb.length()-1-i))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String [] args)
    {
        String str = new String("Do geese see God");
        System.out.println(checkPalindrome(str));
    }
}
