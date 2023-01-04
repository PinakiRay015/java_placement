//java program to find the minimum of two numbers using MIN class
package mathClass;

import java.util.Scanner;

public class minClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The minimum of two numbers is "+Math.min(a , b));
    }
}
