//java program to print sum of 1st N natural number using recursion
package Recursion;

public class sumOfNaturalNumber {
    public static int sum(int num)
    {
        if(num == 1)
        {
            return 1;
        }

        int sum = num + sum(num-1);
        return sum;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println(sum(num));
    }
}
