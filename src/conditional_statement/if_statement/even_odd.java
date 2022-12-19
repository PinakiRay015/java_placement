package conditional_statement.if_statement;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = java.nextInt();

        if(num%2==0)
        {
            System.out.println("Even number");
        }
        else
        {
            System.out.println("Odd number");
        }
    }
}
