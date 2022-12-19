//implementing continue statement to skip the iteration
package loops.continue_statement;

public class main {
    public static void main(String[] args)
    {
        for(int i=1; i<=5 ; i++) //here the condition is to print 1 to 5 numbers
        {
            if(i==3) //here the condition is to skip the number 3 once we reach number 3
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
