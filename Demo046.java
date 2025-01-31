import java.util.Scanner;
public class Demo046{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an year: ");
    int Year = sc.nextInt();
    if(Year%4 ==0 && Year%100 != 0 || Year%400==0){
        System.out.println("Its a leap year");
    }else{
        System.out.println("Its not a leap year:");
    }
}
}