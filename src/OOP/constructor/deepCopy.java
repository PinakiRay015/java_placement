package OOP.constructor;

public class deepCopy {
    public static void main(String[] args) {
        studentMarks s1 = new studentMarks();
        s1.name = "Pinaki Sankar Ray";
        s1.roll = 20010244;
        s1.marks[0] = 85;
        s1.marks[1] = 74;
        s1.marks[2] = 94;

        studentMarks s2 = new studentMarks(s1);
        s1.marks[2] = 100;

        System.out.println("The name of the student is "+s1.name);
        System.out.println("The roll number of the student is "+s1.roll);
        System.out.println("Marks obtain is PCM is");
        for(int i=0 ; i<s1.marks.length ; i++)
        {
            System.out.println(s2.marks[i]);
        }
    }
}

class studentMarks
{
    String name;
    int roll;
    int []marks = new int[3];

    public studentMarks(){}

    //deep copy
    public studentMarks(studentMarks s1)
    {
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0 ; i<marks.length ; i++)
        {
            this.marks[i] = s1.marks[i];
        }
    }
}
