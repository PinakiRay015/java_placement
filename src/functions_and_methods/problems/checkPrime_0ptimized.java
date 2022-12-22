package functions_and_methods.problems;
import java.util.*;
public class checkPrime_0ptimized {
    public static String isPrime(int num)
    {
        String isPrime = "Prime number";
        {
            for(int i = 2 ; i<=Math.sqrt(num) ; i++)
            {
                if(num%i==0)
                {
                    isPrime = "Not a Prime number";
                }
            }
            return isPrime;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(isPrime(num));
    }
}
