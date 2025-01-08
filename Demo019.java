import java.util.Scanner;

public class Demo019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] bases = {5, 10, 20, 25, 30, 35};

        int nearestBase = bases[0];
        int nearestMultiple = number;
        int smallestDifference = Integer.MAX_VALUE;

        for (int base : bases) {
            int remainder = number % base;
            int candidate;

            if (remainder < base / 2.0) {
                candidate = number - remainder;
            } else {
                candidate = number + (base - remainder);
            }

            int difference = Math.abs(number - candidate);

            if (difference < smallestDifference) {
                smallestDifference = difference;
                nearestMultiple = candidate;
                nearestBase = base;
            }
        }

        System.out.println("The number " + number + " is nearest to " + nearestMultiple + " with a base of " + nearestBase + ".");

        scanner.close();
    }
}
