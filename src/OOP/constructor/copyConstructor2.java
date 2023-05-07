//java program to perform deep constructor copy
package OOP.constructor;

public class copyConstructor2 {
    public static void main(String[] args) {
        array arr = new array();
        arr.marks[0] = 87;
        arr.marks[1] = 96;
        arr.marks[2] = 90;

        array newArr = new array(arr);
        arr.marks[2] = 100;
        System.out.println("Marks obtain in different sub are");
        for(int i=0 ; i<arr.marks.length; i++)
        {
            System.out.println(newArr.marks[i]);
        }
    }
}

class array
{
    int []marks = new int[3];

    public array() {

    }

    public array(array newArr)
    {
        for(int i=0 ; i<marks.length ; i++)
        {
            this.marks[i] = newArr.marks[i];
        }
    }
}
