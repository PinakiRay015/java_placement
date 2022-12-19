//java program to check whether a student is pass or fail
package conditional_statement.problems;

import java.util.Scanner;

public class prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();

        //by using the ternary operator
        String res = (marks>=33)?"pass":"fail";
        System.out.println("you are "+res);
    }
}
