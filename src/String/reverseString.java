//java program to reverse a string using String concatenation method
package String;

public class reverseString {
    public static void main(String[] args)
    {
        String name = "ABCD";
        String revName = "";
        int length = name.length();

        for(int i = length-1 ; i>=0 ; i--)
        {
            revName = revName+name.charAt(i);
        }
        System.out.print(revName+"\t");
    }
}
