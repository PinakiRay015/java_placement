package pattern;

public class character {
    static char c = 'A';
    public static void main(String[] args)
    {
        for(int line=1 ; line<=4 ; line++)
        {
            for(int ch=1 ; ch<=line ; ch++)
            {
                System.out.print(c);
                c++;
            }
            System.out.print("\n");
        }
    }
}
