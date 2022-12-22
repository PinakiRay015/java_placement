//java program to check whether a number is prime or not
package functions_and_methods.problems;
import java.util.Scanner;
public class checkPrime {
    public static String isPrime(int num)
    {
        String isPrime = "Prime number";
        for(int i=2 ; i<=num-1 ; i++)
        {
            if(num%i==0)
            {
                isPrime = "Not a Prime Number";
                break;
            }
        }
        return isPrime;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
