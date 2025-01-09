public class Demo021 {

    public static String getFizzBizz(int num) {
        if (num <= 0) {
            return "Error";
        } else if (num % 3 == 0 && num % 5 == 0) {
            return "FIZZBIZZ";
        } else if (num % 3 == 0) {
            return "FIZZ";
        } else if (num % 5 == 0) {
            return "BIZZ";
        } else {
            return Integer.toString(num);
        }
    }

    public static void main(String[] args) {
        System.out.println(getFizzBizz(33));  // Output: FIZZ
        System.out.println(getFizzBizz(5));   // Output: BIZZ
        System.out.println(getFizzBizz(15));  // Output: FIZZBIZZ
        System.out.println(getFizzBizz(7));   // Output: 7
        System.out.println(getFizzBizz(-1));  // Output: Error
        System.out.println(getFizzBizz(0));   // Output: Error
    }
}
