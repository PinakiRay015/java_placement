package functions_and_methods.problems;

import java.util.Scanner;

public class factorial {
    public static void fact(int num)
    {
        int f = 1;
        for(int i=1 ; i<=num ; i++)
        {
            f = f*i;
        }
        System.out.println("The factorial of "+num+" is "+f);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        fact(num);

    }
}
