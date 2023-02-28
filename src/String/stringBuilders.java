//java program to implement StringBuilder class
package String;

public class stringBuilders {
    public static void main(String[] args) {
        String name = new String("Pinaki sankar ray");
        StringBuilder newName = new StringBuilder(); //it is used to transfer the characters from name String to newName String
        for(int i = 0 ; i<name.length() ; i++)
        {
            if(Character.isLetter(name.charAt(i)) || Character.isDigit(name.charAt(i))) //This will consider only the letters and digits from the string
            {
                newName.append(name.charAt(i));
            }
        }
        System.out.println(name);
        System.out.println(newName);
    }
}
