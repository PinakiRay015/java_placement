//java program to print the sum of first N natural number using recursion
package Recursion;

import java.util.Scanner;

public class sumOfNaturalNumbers {
    public static int sum(int num)
    {
        if(num==0)
        {
            return num;
        }
        return num + sum(num-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of first Natural number");
        int num = sc.nextInt();
        System.out.println(sum(num));
    }
}
