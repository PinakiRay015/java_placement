//java program to print the numbers from 1 to 10 using recursion function
package Recursion;

public class increaseNum {
    public static void printInc(int num)
    {
        if(num==10)
        {
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        printInc(num+1);
    }
    public static void main(String[] args) {
        printInc(1);
    }
}
