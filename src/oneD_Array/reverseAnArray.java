package oneD_Array;
public class reverseAnArray {
    public static void reverse(int []array)
    {
        int start = 0;
        int end = array.length-1;
        while(start<end)
        {
           int temp = array[end];
           array[end] = array[start];
           array[start] = temp;

           start++;
           end--;
        }
    }
    public static void main(String[] args) {
        int []array = {2,4,6,8,10,12,14};
        System.out.println("Here is the array before reversing");
        for(int i = 0 ; i<array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
        reverse(array);
        System.out.println("\nHere is the array after reversing");
        for(int i = 0 ; i < array.length ; i++)
        {
            System.out.print(array[i]+"\t");
        }
    }
}
