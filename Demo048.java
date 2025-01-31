import java.util.Scanner;
public class Demo048 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        int sum = 0;
        while (a != 0) {
            int digit = a % 10;
            sum += digit;
            a /= 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}