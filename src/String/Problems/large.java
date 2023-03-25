//java program for determining which string is larger
//If firstString is less than the secondString, it will return a negative integer. i.e firstString < secondString→ returns a negative integer
//If firstString is equal to the secondString it will return zero. i.e firstString == secondString → returns zero
//If firstString is greater than the secondString it will return a positive integer. i.e firstString > secondString → returns a positive integer
package String.Problems;

public class large {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "java";

        int num = (str1.compareTo(str2));
        System.out.println((num == 0) ? "equals" : (num>0)?"str1 is greater" : "STR2 is greater");
    }
}
