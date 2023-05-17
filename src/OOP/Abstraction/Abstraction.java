package OOP.Abstraction;

public class Abstraction {
    public static void main(String [] args)
    {
        cheetah c = new cheetah();
        sloth s = new sloth();

        c.eats();
        c.run();
        s.eats();
        s.run();
    }
}

abstract class animal
{
    public void eats()
    {
        System.out.println("Animal eats");
    }

    abstract void run();
}

class cheetah extends animal
{
    public void run()
    {
        System.out.println("It runs faster");
    }
}

class sloth extends animal
{
    public void run()
    {
        System.out.println("It runs very slow");
    }
}
