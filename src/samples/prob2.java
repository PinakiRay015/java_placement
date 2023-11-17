package samples;

public class prob2 {
    public static StringBuilder stringSwap(String str)
    {
        int length = str.length();
        String ans;
        StringBuilder sb = new StringBuilder();
        if(length%2!=0)
        {
            sb = new StringBuilder("N/A");
        }
        else
        {
            for(int i=0 ; i<str.length()-1 ; i+=2)
            {
                sb.append(str.charAt(i+1));
                sb.append(str.charAt(i));
            }
        }
        return sb;
    }
    public static void main(String[] args) {
        String str = "GEEK";
        System.out.println(stringSwap(str));
    }
}
