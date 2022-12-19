package operators.unary_operators;

public class post_increment {
    public static void main(String[] args)
    {
        int a = 10;
        int b = a++; //here the value of a is assigned to b first and it was increment by 1;
        System.out.println(a);
        System.out.println(b);
    }
}
