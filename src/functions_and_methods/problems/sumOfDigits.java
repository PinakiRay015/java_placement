//java program to find the sum of digits of an integer
package functions_and_methods.problems;

import java.util.Scanner;

public class sumOfDigits {
    public static int sum(int num)
    {
        int ans=0;
        while(num!=0)
        {
            int lastDigit = num%10;
            ans = lastDigit+ans;
            num = num/10;
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("The sum of the digits of the number is "+sum(num));
    }
}
