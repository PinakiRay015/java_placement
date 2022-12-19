//java program to keep entering the numbers till user enters a multiple of 10;
package loops.problems;
import java.util.Scanner;
public class prob3 {
    public static void main(String[ ] agrs)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if(num%10==0)
            {
                break;
            }
        }
        System.out.println("The loop breaks");
    }
}
