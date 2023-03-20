//java program to convert the decimal number into binary number;
package conversions;
public class decimalToBinary {
    public static int dectobin(int dec)
    {
        int binary = 0;
        int pwr = 0;
        while(dec>0)
        {
            int rem = dec%2;
            binary = binary + (int)(rem*Math.pow(10 , pwr));
            pwr++;
            dec = dec/2;
        }
        return binary;
    }
    public static void main(String[] args) {
        int dec = 4;
        System.out.println(dectobin(dec));
    }
}
