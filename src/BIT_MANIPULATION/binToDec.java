//java program to convert a binary digit to decimal digit
package BIT_MANIPULATION;

public class binToDec {
    public static int getDec(int bin)
    {
        int ans = 0;
        int pwr = 0;
        while(bin !=0)
        {
            int lastDigit = bin%10;
            ans += lastDigit*Math.pow(2 ,pwr);
            bin = bin/10;
            pwr++;
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int bin = 100;
        System.out.println(getDec(bin));
    }
}
