//java program to find the power of a given number using pow class
package mathClass;

import java.util.Scanner;

public class pow {
    public static void main(String[] agrs)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number and it's power");
        int num = sc.nextInt();
        int pwr = sc.nextInt();
        System.out.println(Math.pow(num , pwr));
    }
}
