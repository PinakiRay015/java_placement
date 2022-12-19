//java program to print a word 10 times using do while loop
package loops.do_while_loop;
import java.util.Scanner;
public class prob1 {
    public static void main(String[] args)
    {
        Scanner java = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = java.nextLine();
        int i=0;
        do {
            i++;
            System.out.println(i+"->"+word);
        }while(i!=10);
    }
}
