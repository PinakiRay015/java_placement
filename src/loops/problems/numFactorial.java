//java program to find the factorial of a number
package loops.problems;

import java.util.Scanner;

public class numFactorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact = 1;
        System.out.println("Enter the number");
        int num = sc.nextInt();
        for(int i=1 ; i<=num ; i++)
        {
            fact *= i;
        }
        System.out.println("Factorial of the number "+num+" is "+fact);
    }
}
