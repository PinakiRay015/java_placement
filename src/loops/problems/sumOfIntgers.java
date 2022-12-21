//java program to print the sum of odd integers and positive integers
package loops.problems;
import java.util.Scanner;
public class sumOfIntgers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num;
        int choice;
        int psum = 0;
        int nsum = 0;
        do
        {
            System.out.println("Enter the number");
            num = sc.nextInt();
            if(num%2==0)
            {
                psum = psum+num;
            }
            else
            {
                nsum = nsum+num;
            }
            System.out.println("Do you want to enter more numbers? Press 1 to continue or 0 to end");
            choice = sc.nextInt();
        }while (choice==1);
        System.out.println("Sum of the odd numbers are "+nsum);
        System.out.println("Sum of the positive numbers are "+psum);
    }
}
