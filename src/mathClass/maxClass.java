//java program to find the maximum of two numbers using the math class
package mathClass;

import java.util.Scanner;

public class maxClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("The maximum of two numbers is "+Math.max(a , b));
    }
}
