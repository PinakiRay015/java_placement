//implementing function overloading using different parameters
package functions_and_methods.method_overloading;

public class sumOfNum1 {

    //function to calculate sum of two numbers
    public static int sum(int a , int b)
    {
        return a+b;
    }

    //function to calculate sum of three numbers
    public static int sum(int a , int b , int c)
    {
        return a+b+c;
    }
    public static void main(String[] args)
    {
        System.out.println("Sum of 5 and 2 is "+sum(5,2));
        System.out.println("Sum of 10 and 3 and 5 is "+sum(10 , 3 , 5));
    }
}
