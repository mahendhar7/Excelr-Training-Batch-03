public class LTcode002 {
    public int reverse(int x) {
        
        int sign = (x < 0) ? -1 : 1;
        x = Math.abs(x);
        
        
        long reversed = 0;
        while (x > 0) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        
        
        reversed *= sign;
        
        
        if (reversed < Integer.MIN_VALUE || reversed > Integer.MAX_VALUE) {
            return 0;
        }
        
        return (int) reversed; 
    }
}
