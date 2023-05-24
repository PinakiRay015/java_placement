//java program to find the factorial of number using recursion
package Recursion;

import java.util.Scanner;

public class factorial {
    public static int fact(int num)
    {
        if(num==0)
        {
            return 1;
        }
        int f = num * fact(num-1);
        return f;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println(fact(num));
    }
}
