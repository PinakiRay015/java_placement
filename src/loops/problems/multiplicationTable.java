//java program to print the multiplication table by taking the input from the user
package loops.problems;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num");
        int num = sc.nextInt();
        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(num+"X"+i+"="+num*i);
        }
    }
}
