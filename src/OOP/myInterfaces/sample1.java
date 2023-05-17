package OOP.myInterfaces;

public class sample1 {
    public static void main(String[] args)
    {
        color c = new color();
        c.design();
        c.company();
        c.capacity();
        c.color();
    }
}

interface myCar
{
    public void design();
    public void company();
}

class seatCapacity
{
    public void design()
    {
        System.out.println("This is open roof");
    }

    public void capacity()
    {
        System.out.println("This comes with 2 seater");
    }

    public void company()
    {
        System.out.println("BMW");
    }
}

class color extends seatCapacity implements myCar
{
    public void color()
    {
        System.out.println("This comes with black and red color");
    }
}
