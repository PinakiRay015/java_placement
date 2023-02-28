package String;

public class stringFunctions {
    public static void main(String [] args)
    {
        String str = new String("Pinaki");
        System.out.println("This is your String "+str);
        System.out.println("The length of the String is "+str.length()); //function to find the length of the string
        System.out.println("Your String in uppercase is "+str.toUpperCase()); //function to convert the given string into uppercase
        System.out.println("Your String in lowercase is "+str.toLowerCase()); //function to convert the given string into lowercase
        System.out.println("The second letter of your String is "+str.charAt(1)); //function to display a char of particular index from the string
        System.out.println("The new name of your String is "+str.replace("str" , "Rohan"));//function to replace the string with new string
    }
}
