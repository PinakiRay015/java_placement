//java program to check if a number is prime number or not
package loops.problems;
import java.util.Scanner;
public class checkPrime {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();

        for(int i=2 ; i<=num-1 ; i++)
        {
            if(num%i!=0)
            {
                System.out.println("It is a prime number");
            }
            else
            {
                System.out.println("It is not a prime number");
            }
        }
    }
}
