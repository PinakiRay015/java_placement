package OOP.constructor;

public class copyConstructor {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student(s1);
        s1.name = "Pinaki";
        s1.roll = 15;
        s1.password = 20010244;
        System.out.println("The name of the student is "+s1.name);
        System.out.println("The roll number of the student is "+s1.roll);
        System.out.println("The password of the student is "+s1.password);
        s2.password = 20010255;
        System.out.println("The new password is "+s2.password);
    }
}

class student
{
    String name;
    int roll;
    int password;
    public student(){};
    public student(student s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
    }
}