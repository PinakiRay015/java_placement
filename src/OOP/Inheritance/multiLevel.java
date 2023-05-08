//multi level inheritance
package OOP.Inheritance;

public class multiLevel {
    public static void main(String[] args) {
        deviceExpo de = new deviceExpo();
        de.welcome();
        de.androidGreet();
        de.appleGreet();
    }
}

class deviceExpo extends apple
{
    public void welcome()
    {
        System.out.println("Welcome to the device expo");
    }
}

class android1
{
    public void androidGreet()
    {
        System.out.println("Welcome to android");
    }
}

class apple extends android1
{
    public void appleGreet()
    {
        System.out.println("Welcome to apple");
    }
}
