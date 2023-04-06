package OOP.constructor;

public class Types {
    public static void main(String[] args)
    {
        faculty faculty = new faculty();
        faculty faculty1 = new faculty("David jones");
        System.out.println("Name of the computer science faculty is "+faculty1.name);
        faculty faculty2 = new faculty(faculty1);
        System.out.println("Name of the Information Technology faculty is "+faculty2.name);
    }
}

class faculty
{
    String name;

    //non-parameterized constructor
    public faculty() {
        System.out.println("Name of the chemistry faculty is Mr. Jason Roy");
    }

    //parameterized constructor
    public faculty(String name) {
        this.name = name;
    }

    //copy constructor
    public faculty(faculty f1)
    {
        this.name = f1.name;
    }
}
