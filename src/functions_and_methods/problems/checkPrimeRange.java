//java program to check prime number of a particular range of number
package functions_and_methods.problems;
import java.util.Scanner;
public class checkPrimeRange {
    public static boolean checkPrime(int num)
    {
        for(int i=2 ; i<=Math.sqrt(num) ; i++)
        {
            if(num%i==0)
            {
                return false;
            }
        }
        return true;
    }

    public static void checkPrimeRange(int a , int b)
    {
        for(int i=a ; i<=b ; i++)
        {
            if(checkPrime(i))
            {
                System.out.print(i+"\t");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int srtNum = sc.nextInt();
        System.out.println("Enter the ending number");
        int endNum = sc.nextInt();
        checkPrimeRange(srtNum , endNum);
    }
}
