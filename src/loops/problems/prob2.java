//java program to print the number in reversing order
package loops.problems;
import java.util.Scanner;
public class prob2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int num = sc.nextInt();

        while(num!=0)
        {
            int lastdigit = num%10;
            num =num/10;
            System.out.print(lastdigit);

        }
    }
}
