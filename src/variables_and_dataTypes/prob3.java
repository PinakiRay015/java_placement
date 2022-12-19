package variables_and_dataTypes;
import java.util.Scanner;
public class prob3 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the cost of pencil");
        float a = sc.nextFloat();
        System.out.println("Enter the cost of eraser");
        float b = sc.nextFloat();
        System.out.println("Enter the cost of pen");
        float c = sc.nextFloat();

        float totalPrice = a+b+c;
        float gst = totalPrice + (0.18f * totalPrice);
        System.out.println("The total cost of the items is "+totalPrice);
        System.out.println("The total price including the 18% gst is "+gst+totalPrice);

    }
}
