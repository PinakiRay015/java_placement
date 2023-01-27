import java.util.Scanner;

public class binarySearchPractice {
    public static int binarySearch(int []array , int key)
    {
        int start = 0;
        int end = array.length-1;
        while(start<=end)
        {
            int mid = (start+end)/2;
            if(key==array[mid])
            {
                return mid;
            }
            else if(key<array[mid])
            {
                end = mid-1;
            }
            else
            {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []array = {10 , 20 , 30 , 40 , 50 , 60};
        System.out.println("Enter the key");
        int key = sc.nextInt();
        int position = binarySearch(array , key);
        if(position == -1)
        {
            System.out.println("The element not found!!!");
        }
        else
        {
            System.out.println("The element is in the position "+position);
        }
    }
}
