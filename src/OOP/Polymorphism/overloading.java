package OOP.Polymorphism;

public class overloading {
    public static void main(String[] args) {
        myStudent ms = new myStudent();
        ms.performance();
        ms.performance("Cricket");
    }
}

class myStudent
{
    String sports;
    public void performance()
    {
        System.out.println("This is the overall performance of the student");
    }

    public void performance(String Sports)
    {
        StringBuilder sb = new StringBuilder("");
        for(int i=0 ; i<Sports.length() ; i++)
        {
            sb.append(Sports.charAt(i));
        }
        System.out.println("This is the Student's performance in "+sb);
    }
}