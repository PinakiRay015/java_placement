//java program to count the lower case vowel
package String.Problems;

public class countLowerCaseVowels {
    public static int countVowels(String str)
    {
        str = str.toLowerCase();
        int count = 0;
        for(int i = 0 ; i<str.length() ; i++)
        {
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args)
    {
        String str = "Alpha Java";
        System.out.println(countVowels(str));
    }
}
