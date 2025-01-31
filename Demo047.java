import java.util.Scanner;
public class Demo047 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int count = 0;
        while (a != 0) {
            a /= 10;
            count++;
        }
        System.out.println("Number of digits: " + count);
    }
}
