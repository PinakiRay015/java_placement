//java program to illustrate custom constructor
package OOP.constructor;

public class constructors {
    public static void main(String[] args) {
        myStudent s1 = new myStudent("Pinaki");
        System.out.println("The name of the student is "+s1.name);
    }
}

class myStudent
{
    String name;
    int roll;
    public myStudent(String name)
    {
        this.name = name;
        System.out.println("Constructor is called!!");
    }
}