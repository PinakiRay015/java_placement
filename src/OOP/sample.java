package OOP;

public class sample {
    public static void main(String[] args) {
        Pen pen = new Pen();
        Student student = new Student();
        pen.setColor("red");
        pen.setTipSize(12);
        student.setName("Rohan");
        student.setRollNo(20010244);
        System.out.println("The color of the pen is "+pen.color);
        System.out.println("The size of the pen tip is "+pen.tipSize);
        System.out.println("The name of the student is "+student.name);
        System.out.println("The roll number of the student is "+student.rollNo);
    }
}

class Pen
{
    String color;
    int tipSize;

    void setColor(String penColor)
    {
        color = penColor;
    }

    void setTipSize(int size)
    {
        tipSize = size;
    }
}

class Student
{
    String name;
    int rollNo;

    float percentage;

    void setName(String studentName)
    {
        name = studentName;
    }

    void setRollNo(int studentRoll)
    {
        rollNo = studentRoll;
    }
}