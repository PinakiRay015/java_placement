//java program to print the sum of n natural numbers
package loops.while_loop;
import java.util.Scanner;
public class prob3 {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int range = sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=range)
        {
            System.out.println(i);
            sum = sum+i;
            i++;
        }
        System.out.println("The sum of natural numbers are "+sum);
    }
}
