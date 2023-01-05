//java program to store the marks of phys , chem and maths in an array if one dimensional
package oneD_Array;

import java.util.Scanner;

public class arrayPart1 {
    public static int percentage(int num1 , int num2 , int num3)
    {
        int ans = (num1+num2+num3)/3;
        return ans;
    }
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

        //updating of values in array
        System.out.println("\nEnter the updated mark of mathematics");
        marks[2] = sc.nextInt();
        System.out.println("Your marks in now in mathematics is "+marks[2]);

        //Finding the percentage
        System.out.println("Your percentage is "+percentage(marks[0] , marks[1] , marks[2])+"%");
    }
}
