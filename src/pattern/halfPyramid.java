//java program to print the half pyramid number pattern
package pattern;

public class halfPyramid {
    public static void main(String[] args) {
        for(int line=1 ; line<=4 ; line++)
        {
            for(int num=1 ; num<=line ; num++)
            {
                System.out.print(num);
            }
            System.out.print("\n");
        }
    }
}
