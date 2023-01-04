//java program to return a boolean TRUE if the argument is even otherwise FALSE
package functions_and_methods.problems;

import java.util.Scanner;

public class evenOdd {
    public static boolean isEven(int num)
    {
        if(num%2==0)
        {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        System.out.println(isEven(num));
    }
}
