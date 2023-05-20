//java program to print number from 10 to 1 using recursion
package Recursion;

public class decreaseNum {
    public static void printDec(int num)
    {
        if(num==1)
        {
            System.out.print(num);
            return;
        }
        System.out.print(num+" ");
        //function is called recursively
        printDec(num-1);
    }
    public static void main(String[] args) {
        printDec(10);
    }
}
