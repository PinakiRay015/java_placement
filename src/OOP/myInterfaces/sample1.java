package OOP.myInterfaces;

public class sample1 {
    public static void main(String[] args)
    {
        myCar c = new myCar();
        c.seatCapacity();
        c.color();
    }
}

interface BMW
{
    public void color();
}

interface AUDI
{
    public void seatCapacity();
}

class myCar implements BMW , AUDI
{
    public void color()
    {
        System.out.println("It comes with black and red color");
    }

    public void seatCapacity()
    {
        System.out.println("It has 2 seater capacity");
    }
}
