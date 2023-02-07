import java.util.*;
public class AffineCipher {
    public static String encryptC(char ch) {
        int numEncrypt = 0;
        char charEncrypt = ' ';
        char a[] = new char[26];
        for (int i = 0; i <= 25; i++) {
            a[i] = (char) (33 + i);
        }
        for (int i = 0; i <= 25; i++) {
            if (ch == (char) (65 + i)) {
                numEncrypt = ((i) * 7 + 2) % 26;
                charEncrypt = a[numEncrypt];
            }
        }
        String encrypt = Character.toString(charEncrypt);
        return encrypt;
    }

    public static String encryptS(char ch) {
        int numEncrypt = 0;
        char charEncrypt = ' ';
        char a[] = new char[26];
        for (int i = 0; i <= 25; i++) {
            a[i] = (char) (65 + i);
        }
        for (int i = 0; i <= 25; i++) {
            if (ch == (char) (97 + i)) {
                numEncrypt = ((i) * 7 + 2) % 26;
                charEncrypt = a[numEncrypt];
            }
        }
        String encrypt = Character.toString(charEncrypt);
        return encrypt;
    }

    public static String encrypt(String plainText) {
        char ch = ' ';
        String c = "", s = "";
        for (int i = 0; i < plainText.length(); i++) {
            ch = plainText.charAt(i);
            if (ch != ' ') {
                if (ch >= 65 && ch < 97)
                    c = c + encryptC(ch);
                else if (ch >= 97)
                    c = c + encryptS(ch);
            } else {
                s = s + c + " ";
                c = "";
            }
        }
        s = s.trim();
        return s;
    }

    public static String decryptC(char ch) {
        int numDecrypt = 0;
        char charDecrypt = ' ';
        char a[] = new char[26];
        for (int i = 0; i <= 25; i++) {
            a[i] = (char) (97 + i);
        }
        for (int i = 0; i <= 25; i++) {
            if (ch == (char) (65 + i)) {
                numDecrypt = ((i + 24) * 15) % 26;
                charDecrypt = a[numDecrypt];
            }
        }
        String decrypt = Character.toString(charDecrypt);
        return decrypt;
    }

    public static String decryptS(char ch) {
        int numDecrypt = 0;
        char charDecrypt = ' ';
        char a[] = new char[26];
        for (int i = 0; i <= 25; i++) {
            a[i] = (char) (65 + i);
        }
        for (int i = 0; i <= 25; i++) {
            if (ch == (char) (33 + i)) {
                numDecrypt = ((i + 24) * 15) % 26;
                charDecrypt = a[numDecrypt];
            }
        }
        String decrypt = Character.toString(charDecrypt);
        return decrypt;
    }

    public static String decrypt(String plainText) {
        char ch = ' ';
        String c = "", s = "";
        for (int i = 0; i < plainText.length(); i++) {
            ch = plainText.charAt(i);
            if (ch != ' ') {
                if (ch >= 33 && ch < 59)
                    c = c + decryptS(ch);
                else if (ch >= 65)
                    c = c + decryptC(ch);
            } else {
                s = s + c + " ";
                c = "";
            }
        }
        s = s.trim();
        return s;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your text");
        String s = sc.nextLine();
        s = s.trim() + " ";
        String encrypt = encrypt(s);
        System.out.println("Your Encryption code");
        System.out.println(encrypt);
        String w = encrypt + " ";
        String decrypt = decrypt(w);
        System.out.println("Your Decryption code");
        System.out.println(decrypt);
    }
}
