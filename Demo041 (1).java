import java.util.Scanner;
public class Demo041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        if (isVowel(character)) {
            System.out.println(character + " is a vowel.");
        } else if (isConsonant(character)) {
            System.out.println(character + " is a consonant.");
        } else {
            System.out.println(character + " is not a letter.");
        }
    }

    public static boolean isVowel(char character) {
        character = Character.toLowerCase(character);
        return character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u';
    }

    public static boolean isConsonant(char character) {
        character = Character.toLowerCase(character);
        return Character.isLetter(character) && !isVowel(character);
    }
}