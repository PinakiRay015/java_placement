//Java program to implement a String
package String;

import java.util.Scanner;

public class Implementation {
    public static void main(String [] args)
    {
        String str1 = "Pinaki"; //using default method

        String str2 = new String("Rohan"); //using new keyword

        Scanner sc = new Scanner(System.in); //using Scanner class by taking input from keyboard
        System.out.println("Enter the name");
        String str3 = sc.nextLine();
        System.out.println(str1);
        System.out.println(str3);
        System.out.println(str3);
    }
}
