package String.Problems;

public class stringMinimization {
    public static StringBuilder stringCompress(String str) {
        StringBuilder str2 = new StringBuilder("");
        StringBuilder str3 = null;
        for (int i = 0; i < str.length(); i++) {
            int count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            str2.append(str.charAt(i));
            str3 = count > 1 ? str2.append(count) : str2.append("");
        }
        return str3;
    }
    public static void main(String[] args)
    {
        String str = "aaabbbbcc";
        System.out.println(stringCompress(str));
    }
}
