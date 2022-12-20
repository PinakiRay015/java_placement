//java program to print the right angle triangle pattern
package pattern;
public class right_angled_triangle {
    public static void main(String[] args) {
        for(int lines=1 ; lines<=4 ; lines++)
        {
            for(int star = 1 ; star<=lines ; star++)
            {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
