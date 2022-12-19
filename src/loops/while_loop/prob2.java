//java program to print number series from a starting position to ending position
package loops.while_loop;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the starting number");
        int a = java.nextInt();
        System.out.println("Enter the ending number");
        int b = java.nextInt();

        int i=a;
        while(i<=b)
        {
            System.out.println(i);
            i++;
        }
    }
}
