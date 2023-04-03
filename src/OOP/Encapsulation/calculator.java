package OOP.Encapsulation;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        myCalculator myCalculator = new myCalculator();
        System.out.println("1-> addition");
        System.out.println("2-> multiplication");
        System.out.println("3-> subtraction");
        System.out.println("4-> division");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        switch (choice)
        {
            case 1-> System.out.println(myCalculator.add());
            case 2-> System.out.println(myCalculator.mul());
            case 3-> System.out.println(myCalculator.minus());
            case 4-> System.out.println(myCalculator.divide());
            default -> System.out.println("Invalid choice");
        }
    }
}

class myCalculator
{
    private int a = 20;
    private int b = 10;
    int addition , multiplication , subtraction , division;

    void getA(int a)
    {
        this.a = a;
    }

    void getB(int b)
    {
        this.b = b;
    }

    int add()
    {
         return addition = a + b;
    }

    int mul()
    {
          return multiplication = a*b;
    }

    int minus()
    {
        return subtraction = a - b;
    }

    int divide()
    {
        return division = a/b;
    }

}
