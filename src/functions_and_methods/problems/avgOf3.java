//java program to find the average of 3 numbers
package functions_and_methods.problems;
import java.util.Scanner;
public class avgOf3 {
    public static float avg(float num1 , float num2 , float num3)
    {
        float av = (num1+num2+num3)/3;
        return av;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 numbers");
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        System.out.println("The average of 3 numbers is "+avg(a , b , c));
    }
}
