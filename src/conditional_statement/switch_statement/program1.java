package conditional_statement.switch_statement;

import java.util.Scanner;

public class program1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1->Burger");
        System.out.println("2->Pizza");
        System.out.println("3->Momo");

        System.out.println("\nEnter your choice");
        int choice = sc.nextInt();

        switch (choice)
        {
            case 1->System.out.println("Your burger will be in some minutes");
            case 2->System.out.println("Your pizza will be in some minutes");
            case 3->System.out.println("Your momo will be in some minutes");
            default -> System.out.println("Invalid choice");
        }
    }
}
