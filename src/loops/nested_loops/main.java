//java program to find the largest 3 number using nested loop
package loops.nested_loops;
import java.util.Scanner;
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if(a>b)

        {
            if(a>c)
            {
                System.out.println(a+" is the largest");
            }
            else
            {
                System.out.println(c+" is the largest");
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println( b+" is the largest");
            }
            else
            {
                System.out.println(c+" is the largest");
            }
        }
    }
}
