import java.util.*;

public class palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter your no. :");
        int num = sc.nextInt();
        isPalindrome(num);
        sc.close();
    }

    static int reverse(int num){
        int ans=0;
        while(num > 0){
            ans=num % 10 + ans*10;
            num/=10;

        }
        return ans;
    }

    static void isPalindrome(int num){
        if(num==reverse(num)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}
