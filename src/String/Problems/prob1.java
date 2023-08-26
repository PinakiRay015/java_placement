//java program to count number of lower case in a string
package String.Problems;

public class prob1 {
    public static int countLowerCaseVowels(String str)
    {
        int count = 0;
        for(int i=0 ; i<str.length() ; i++)
        {
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u')
            {
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "I am Pinaki Sankar Ray";
        System.out.println(countLowerCaseVowels(str));
    }
}
