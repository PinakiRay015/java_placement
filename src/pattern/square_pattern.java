package pattern;
import java.util.Scanner;
public class square_pattern {
    public static void main(String[ ] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = "*";

        int j=1;
        while(j<=4)
        {
            for(int i=1 ; i<=4 ; i++)
            {
                System.out.print(str);
            }
            System.out.print("\n");
            j++;
        }
    }
}
