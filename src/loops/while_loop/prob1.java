//print a word 10 times using while loop

package loops.while_loop;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();
        int i=0;
        while(i!=10)
        {
            i++;
            System.out.println(i+"->"+word);
        }
    }
}
