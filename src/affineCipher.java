import java.util.Scanner;
public class affineCipher {

    public static String encrypt(String plaintext, int a, int b) {
        StringBuilder ciphertext = new StringBuilder();

        for (int i = 0; i < plaintext.length(); i++) {
            char ch = plaintext.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    int x = (int)ch - 65;
                    int y = (a * x + b) % 26;
                    char c = (char)(y + 65);
                    ciphertext.append(c);
                } else {
                    int x = (int)ch - 97;
                    int y = (a * x + b) % 26;
                    char c = (char)(y + 97);
                    ciphertext.append(c);
                }
            } else {
                ciphertext.append(ch);
            }
        }

        return ciphertext.toString();
    }

    public static String decrypt(String ciphertext, int a, int b) {
        int aInverse = 0;
        int m = 26;

        for (int i = 0; i < m; i++) {
            if ((a * i) % m == 1) {
                aInverse = i;
                break;
            }
        }

        StringBuilder plaintext = new StringBuilder();

        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            if (Character.isLetter(ch)) {
                if (Character.isUpperCase(ch)) {
                    int y = (int)ch - 65;
                    int x = (aInverse * (y - b + m)) % m;
                    char c = (char)(x + 65);
                    plaintext.append(c);
                } else {
                    int y = (int)ch - 97;
                    int x = (aInverse * (y - b + m)) % m;
                    char c = (char)(x + 97);
                    plaintext.append(c);
                }
            } else {
                plaintext.append(ch);
            }
        }

        return plaintext.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the plaintext");
        String plaintext = sc.nextLine();
        System.out.println("Enter the key pair A and B for decryption");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Your message : "+plaintext);
        String ciphertext = encrypt(plaintext, a, b);
        System.out.println("Ciphertext: " + ciphertext);

        String decryptedText = decrypt(ciphertext, a, b);
        System.out.println("Decrypted Text: " + decryptedText);
    }

}
