package BIT_MANIPULATION.OPERATIONS;

public class get_ith_bit {
    public static int check_ith_bit(int bin , int i)
    {
        int bitMasking = 1<<i;
        if(((bin & bitMasking)==0))
        {
            return 0;
        }

        return 1;
    }
    public static void main(String[] args) {
        System.out.println("The ith bit is "+check_ith_bit(10 , 3));
    }
}
