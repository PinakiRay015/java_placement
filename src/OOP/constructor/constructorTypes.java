package OOP.constructor;

public class constructorTypes {
    public static void main(String[] args) {
        faculty1 f1 = new faculty1("Rohan");
        faculty2 f2 = new faculty2();
        System.out.println("The name of the faculty 1 is "+f1.name);
    }
}

class faculty1
{
    String name;
    public faculty1(String name) { //parameterized constructor
        this.name = name;
    }
}

class faculty2
{
    public faculty2() {  //non-parameterized constructor
        String name = "Akash";
        System.out.println("The name of faculty 2 is "+name);
    }
}
