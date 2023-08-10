package ArrayList;

import java.util.ArrayList;

public class implementation {
    public static void main(String[] args) {
        //Declaring the integer
        ArrayList<Integer> StudentList1 = new ArrayList<>(); //Integer type
        ArrayList<String> StudentList2 = new ArrayList<>(); //String type
        ArrayList<Boolean> StudentList3 = new ArrayList<>(); //Boolean type

        //Operations
        //element addition O(1)
        StudentList1.add(12);
        StudentList1.add(13);
        StudentList1.add(14);
        StudentList1.add(15);
        StudentList1.add(16);

        //adding element x at the position ith place
        StudentList1.add(2 , 452);

        //get element
        int element = StudentList1.get(2);
        System.out.println(element);

        //remove element
        StudentList1.remove(4);

        //set element at ith index
        StudentList1.set(1 , 300);

        //contains element (means to check if the element x is present in array List or not). IT IS A BOOLEAN FUNCTION
        Boolean ans = StudentList1.contains(12);

        //displaying or getting all the elements of an ArrayList
        for(int i=0 ; i<StudentList1.size() ; i++)
        {
            System.out.print(StudentList1.get(i)+" ");
        }
        System.out.println("");
        System.out.println(ans);

    }
}
