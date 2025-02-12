import java.util.Scanner;

public class Demo052 {
    public static void main(String[] args) {
        int sum = 0, Each_Digit;
        System.out.println("enter the number: ");
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int temp = input;

        while (input > 0) {

            Each_Digit = input % 10;
            sum = sum + (Each_Digit * Each_Digit * Each_Digit);
            input = input / 10;

        }

        if (sum == temp) {
            System.out.println("armstrong number");
        } else {
            System.out.println("not");
        }

        sc.close();

    }
};