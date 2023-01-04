//java program to find the square root of  a number using sqrt class
package mathClass;

import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        System.out.println("The square root of the number is "+Math.sqrt(num));
    }
}
