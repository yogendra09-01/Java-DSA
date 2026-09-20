import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your number:");
        int num=sc.nextInt();
        System.out.println(digitSum(num));
        sc.close();
    }
    static int digitSum(int num){
        int sum=0;
        while (num>0) {
            int lastDigit=num % 10;
            sum += lastDigit;
            num /= 10;

        }
        return sum;
    }
}
