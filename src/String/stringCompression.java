//java program to compress a string
package String;

public class stringCompression {
    public static StringBuilder compress(String str)
    {
        StringBuilder sb = new StringBuilder();
        StringBuilder sb1 = new StringBuilder();
        for(int i=0 ; i<str.length() ; i++)
        {
            int count = 1;
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1))
            {
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            sb1 = count > 1 ? sb.append(count) : sb.append("");

        }

        return sb1;
    }
    public static void main(String[] args)
    {
        String str = "aaabbcccdd";
        System.out.println(compress(str));
    }
}
