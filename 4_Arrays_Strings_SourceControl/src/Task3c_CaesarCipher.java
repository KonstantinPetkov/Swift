

import java.util.Scanner;

public class Task3c_CaesarCipher {

    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public static String encrypt(String plain_Text, int shiftKey) {
        
        plain_Text = plain_Text.toLowerCase();
        String cipherText = "";
        for (int i = 0; i < plain_Text.length();) {
            if (plain_Text.charAt(i) == ' ') {

                cipherText += plain_Text.charAt(i);
                i++;
            } else {
                int charPosition = ALPHABET.indexOf(plain_Text.charAt(i));
                int keyVal = (shiftKey + charPosition) % 26;
                char replaceVal = ALPHABET.charAt(keyVal);
                cipherText += replaceVal;
                i++;
            }
        }
        return cipherText;
    }

    public static String decrypt(String cipherText, int shiftKey) {
        cipherText = cipherText.toLowerCase();
        String plain_Text = "";
        for (int i = 0; i < cipherText.length();) {
            if (cipherText.charAt(i) == ' ') {
                plain_Text += cipherText.charAt(i);
                i++;
            } else {
                int charPosition = ALPHABET.indexOf(cipherText.charAt(i));
                int keyVal = (charPosition - shiftKey) % 26;
                if (keyVal < 0) {
                    keyVal = ALPHABET.length() + keyVal;

                }
                char replaceVal = ALPHABET.charAt(keyVal);
                plain_Text += replaceVal;
                i++;
            }
        }
        return plain_Text;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter text: ");
        String plaintext = input.nextLine();
        System.out.println("Enter n shift integer: ");
        int n = input.nextInt();
        String encryption = encrypt(plaintext, n);
        System.out.println("Here is the cipher text: " + encryption);
        System.out.println("Decrypted message: " + decrypt(encryption, n));
    }

}
