package BIT_MANIPULATION.OPERATIONS;

public class set_ith_bit {
    public static int setting_ith_bit(int bin , int i)
    {
        int bitMask = 1 << i;
        return bin | bitMask;
    }
    public static void main(String[] args) {
        System.out.println(setting_ith_bit(10 , 2));
    }
}
