//java program to print a word 10 times using for loop

package loops.for_loop;

import java.util.Scanner;

public class prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = sc.nextLine();

        for(int i=1 ; i<=10 ; i++)
        {
            System.out.println(i+"->"+word);
        }
    }
}
