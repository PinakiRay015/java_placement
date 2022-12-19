package operators.unary_operators;

public class pre_increment {
    public static void main(String[] args) {
        int a = 10;
        int b = ++a; //here the value of a increment by 1 first and then the value assigned to b
        System.out.println(a);
        System.out.println(b);
    }
}
