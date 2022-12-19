//implementing break statement to come out from the loop
package loops.break_statement;

public class main {
    public static void main(String[] args)
    {
        for(int i=1 ; i<=5 ; i++) //here the condition is to print 1-5 numbers
        {
            if(i==3)
            {
                break; //here the condition is to break the loop once I reach 3
            }
            System.out.println(i);
        }
        System.out.println("I'm out of the loop");
    }
}
