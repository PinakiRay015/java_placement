package ArrayList;

import java.util.ArrayList;

public class sorting {
    public static ArrayList<Integer> selectionSort(ArrayList<Integer>myList)
    {
        for(int i=0 ; i<myList.size()-1 ; i++)
        {
            int min = i;
            for(int j=i+1 ; j<myList.size() ; j++)
            {
                min = (myList.get(j) < myList.get(min) ? j : min);
            }

            if(min != i)
            {
                int temp = myList.get(i);
                myList.set(i , myList.get(min));
                myList.set(min , temp);
            }
        }
        return myList;
    }
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(37);
        myList.add(560);
        myList.add(67);
        myList.add(12);
        myList.add(50);

        System.out.println(selectionSort(myList));
    }
}
