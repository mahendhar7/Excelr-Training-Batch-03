import java.util.Scanner;
class Demo049{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);   
        System.out.println("Enter the values of x: ");
        int x = sc.nextInt();
        Demo049 obj = new Demo049();
        int a = obj.reverse(x);
        System.out.println("The reverse of the given number is: "+a);
    }
    int reverse(int x){
        int reverse = 0;
        while(x != 0){
            reverse = reverse*10 + x%10;
            x = x/10;
        }
        return reverse;
    }
}