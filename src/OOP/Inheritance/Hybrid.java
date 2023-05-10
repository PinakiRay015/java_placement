//java program to show hybrid inheritance
package OOP.Inheritance;

public class Hybrid {
    public static void main(String [] args)
    {
        myTuna myTuna = new myTuna();
        myShark myShark = new myShark();
        myPeacock myPeacock = new myPeacock();
        myDog myDog = new myDog();
        myHuman myHuman = new myHuman();
        myCat myCat = new myCat();

        myTuna.breathe();
        myTuna.about();
        myTuna.swim();

        myShark.breathe();
        myShark.about();
        myShark.swim();

        myPeacock.breathe();
        myPeacock.about();
        myPeacock.fly();

        myDog.birth();
        myDog.about();
        myDog.birth();

        myHuman.breathe();
        myHuman.about();
        myHuman.birth();

        myCat.breathe();
        myCat.about();
        myCat.birth();
    }
}

class myAnimal
{
    public void breathe()
    {
        System.out.println("This is the breathe function of animals");
    }
}

class myFish extends animal
{
    public void swim()
    {
        System.out.println("This is the swim function of the fish");
    }
}

class myBird extends myAnimal
{
    public void fly()
    {
        System.out.println("This is the flying function of the bird");
    }
}

class myMammal extends myAnimal
{
    public void birth()
    {
        System.out.println("This is the birth function of the mammals");
    }
}

class myTuna extends myFish
{
    public void about()
    {
        System.out.println("This is Tuna fish");
    }
}

class myShark extends myFish
{
    public void about()
    {
        System.out.println("This is shark fish");
    }
}

class myPeacock extends myBird
{
    public void about()
    {
        System.out.println("This is peacock bird");
    }
}

class myDog extends myMammal
{
    public void about()
    {
        System.out.println("This is dog");
    }
}

class myHuman extends myMammal
{
    public void about()
    {
        System.out.println("This is human");
    }
}

class myCat extends myMammal
{
    public void about()
    {
        System.out.println("This is cat");
    }
}
