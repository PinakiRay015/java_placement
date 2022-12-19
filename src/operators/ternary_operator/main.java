package operators.ternary_operator;

public class main {
    public static void main(String[] args) {

        int larger = (8>9)?8:9;
        System.out.println("The larger number is "+larger);

        String type = (10%5==0)?"true":"false";
        System.out.println("It is "+type);
    }
}
