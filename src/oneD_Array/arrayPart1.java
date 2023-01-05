//java program to store the marks of phys , chem and maths in an array if one dimensional
package oneD_Array;

import java.util.Scanner;

public class arrayPart1 {
    public static void main(String[] args) {
        int[] marks = new int[100];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of physics");
        marks[0] = sc.nextInt();
        System.out.println("Enter the marks of chemistry");
        marks[1] = sc.nextInt();
        System.out.println("Enter the marks of mathematics");
        marks[2] = sc.nextInt();

        System.out.println("Your marks in chemistry is "+marks[1]);
        System.out.println("Your marks in physics is "+marks[0]);
        System.out.println("Your marks in mathematics is "+marks[2]);
    }
}
