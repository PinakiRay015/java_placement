//implementing method overloading using different datatype
package functions_and_methods.method_overloading;

public class sumOfNum2 {
    public static int sum(int a , int b)
    {
        return a+b;
    }

    public static float sum(float a , float b)
    {
        float ans = Float.parseFloat(String.format("%.2f" , a+b));
        return ans;
    }
    public static void main(String[] args)
    {
        System.out.println("The sum of 10 and 5 is "+sum(10 , 5));
        System.out.println("The sum of 2.4 and 10.4 is "+sum(2.4f , 10.4f));
    }
}
