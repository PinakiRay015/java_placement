//java program to illustrate constructor overloading
package OOP.constructor;

public class constructorOverloading {
    public static void main(String[] args)
    {
        newStudent newStudent1 = new newStudent(45);
        newStudent newStudent2 = new newStudent("Pinaki");
        System.out.println("The name of the student is "+newStudent2.name);
        System.out.println("The Roll number of the student is "+newStudent1.roll);
    }
}

class newStudent
{
    int roll;
    String name;

    public newStudent(int roll) {
        this.roll = roll;
    }

    public newStudent(String name) {
        this.name = name;
    }
}
