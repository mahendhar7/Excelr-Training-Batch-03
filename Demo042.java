import java.util.Scanner;
public class Demo042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a lowercase character: ");
        char a = sc.next().charAt(0);
        char uppercaseChar = Character.toUpperCase(a);
        System.out.println("Uppercase character: " + uppercaseChar);

        System.out.println("Enter an uppercase character:");
        char b = sc.next().charAt(0);
        char lowercaseChar = Character.toLowerCase(b);
        System.out.println("Lowercase letter is " + lowercaseChar);
    }
}
