//hierarchical level of inheritance
package OOP.Inheritance;

public class hierarchical {
    public static void main(String[] args) {
        dog dog = new dog();
        fish fish = new fish();
        dog.breathe();
        dog.bark();
        fish.breathe();
        fish.swim();
    }
}

class animal
{
    public void breathe()
    {
        System.out.println("This is breathe function");
    }
}

class fish extends animal
{
    public void swim()
    {
        System.out.println("This is swim function");
    }
}

class dog extends animal
{
    public void bark()
    {
        System.out.println("This is bark function");
    }
}
