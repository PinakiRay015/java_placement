//java program to finding the length of the number
package loops.problems;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = 0;
        while(num!=0)
        {
            num = num/10;
            temp++;
        }
        System.out.println(temp);
    }
}
