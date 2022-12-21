//java program to enter all the digits entered by the user except the multiples of 10
package loops.problems;
import java.util.Scanner;
public class multipleOf10_part2 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Enter the number");
            int num = sc.nextInt();
            if(num%10==0)
            {
                continue;
            }
            System.out.println("number is "+num);
        }
    }
}
