import java.util.*;

public class evenOrOdd{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. :");
        int num=sc.nextInt();

        if(isEven(num)){
            System.out.println("No. is Even");
        }else{
            System.out.println("No. is odd");
        }
    }

    static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }else{
            return false;
        }
    }
}
