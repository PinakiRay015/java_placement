//java program to check if the binary number is even or odd
package BIT_MANIPULATION;

public class oddEven {
    public static String checkOddEven(int num)
    {
        int bitmask = 1;
        return  (num & bitmask) == 0 ? "even" : "odd";
    }
    public static void main(String[] args) {
        System.out.println("This number is "+checkOddEven(4));
    }
}
