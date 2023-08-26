//java program to print the number in a decreasing order using recursion
package Recursion;

public class decNum {
    public static void printDecNum(int num)
    {
        if(num<1)
        {
            return ;
        }
        System.out.println(num);
        printDecNum(num-1);
    }
    public static void main(String[] args) {
        int num = 10;
        printDecNum(num);
    }
}
