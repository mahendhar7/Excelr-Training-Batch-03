import java.util.Scanner;

public class Demo043 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an uppercase character: ");
        char ch = sc.next().charAt(0);
        sc.close();

        char lowercaseChar = Character.toLowerCase(ch);

        System.out.println("Lowercase character: " + lowercaseChar);
    }
}
