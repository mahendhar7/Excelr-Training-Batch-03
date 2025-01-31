import java.util.Scanner;
public class LTCode005 {
    public int[] twoSum(int[] nums, int target) {
        int indi[] = new int[2];
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target && i != j) {
                    indi[0] = i;
                    indi[1] = j;
                }
            }
        }
        return indi;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();       
        LTCode005 solution = new LTCode005();
        int[] result = solution.twoSum(nums, target);       
        System.out.println("Indices of numbers that add up to target: [" + result[0] + ", " + result[1] + "]");       
        scanner.close();
    }
}
