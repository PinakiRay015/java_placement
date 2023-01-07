//java program to perform an array operation using function by passing the arguments
package oneD_Array;

import java.util.Scanner;
public class arrayAsFunction {
    public static void update(int [] marks)
    {
        for(int i =0  ; i<marks.length ; i++)
        {
            marks[i] = marks[i] + 5;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = sc.nextInt();
        int [] marks = new int[size];
        for(int i = 0 ; i<marks.length ; i++)
        {
            marks[i] = sc.nextInt();
        }
        System.out.println("Here is the marks before the update");
        for(int i =0 ; i<marks.length  ; i++)
        {
            System.out.print(marks[i]+"\t");
        }
        update(marks);
        System.out.println("");
        System.out.println("Here is the marks after the update");
        for(int i =0 ; i < marks.length ; i++)
        {
            System.out.print(marks[i]+"\t");
        }
    }
}
