//java program to find the average of 3 numbers
package variables_and_dataTypes;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 3 three numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int avg = (a+b+c)/3;
        System.out.println("The average of 3 numbers is "+(float)avg);
    }
}
