//java program to find the factorial of a number using recursion
package Recursion;

public class factorial {
    public static int factorialOfNum(int num)
    {
        if(num<1)
        {
            return 1;
        }

        int fact = num * factorialOfNum(num-1);
        return fact;
    }
    public static void main(String[] args) {
        System.out.println(factorialOfNum(5));
    }
}
