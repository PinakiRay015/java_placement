//java program to calculate the binomial coefficient
package functions_and_methods.problems;

import java.util.Scanner;

public class binomial_coefficient {
    public static int factorial(int num)
    {
        int fact = 1;
        for(int i=1 ; i<=num ; i++)
        {
            fact = fact*i;
        }
        return fact;
    }
    public static int binCoeff(int n , int r)
    {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);
        int bc = fact_n/(fact_r*fact_nmr);
        return bc;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        int bc = binCoeff(n,r);
        System.out.println("The binomial coefficient is "+bc);
    }
}
