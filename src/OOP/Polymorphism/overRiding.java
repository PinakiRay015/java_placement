//function override in java
package OOP.Polymorphism;

public class overRiding {
    public static void main(String[] args) {
        myDeer  myDeer = new myDeer();
        myDeer.eat();
    }
}

class myAnimal
{
    public void eat()
    {
        System.out.println("Eats anything");
    }
}

class myDeer extends myAnimal
{
    @Override
    public void eat()
    {
        System.out.println("Eat grass");
    }
}
