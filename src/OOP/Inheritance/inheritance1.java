package OOP.Inheritance;
class android
{
    public void switchONN()
    {
        System.out.println("Device is switching onn");
    }
    public void switchOFF()
    {
        System.out.println("Device is switching off");
    }
}

class samsung extends android
{
    public void display()
    {
        System.out.println("Welcome to galaxy");
    }
}
public class inheritance1 {
    public static void main(String[] args)
    {
        samsung s1 = new samsung();
        s1.switchONN();
        s1.display();
        s1.switchOFF();
    }
}
