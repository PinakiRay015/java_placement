//java program to convert binary number to decimal number
package conversions;
public class binaryToDecimal {
    public static int convert(int num)

    {
        int pr = 0;
        int decimal = 0;
        while(num>0)
        {
            int lastDigit = num%10;
            num = num/10;
            decimal = decimal + (lastDigit * (int)Math.pow(2 , pr));
            pr++;
        }
        return decimal;
    }
    public static void main(String[] args) {
        int binNum = 100;
        System.out.println(convert(binNum));
    }
}
