import java.util.Scanner;
public class practice {
    public static int binToDec(int num)
    {
        int decimal = 0;
        int pwr = 0;
        while(num>0)
        {
            int lastDigit = num%10;
            decimal = decimal + (int)(lastDigit*Math.pow(2 , pwr));
            pwr++;
            num = num/10;
        }
        return decimal;
    }
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the binary number");
        int binNum = sc.nextInt();
        System.out.println(binToDec(binNum));
    }
}
