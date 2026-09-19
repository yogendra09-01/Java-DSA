public class avgOf3No {
    public static void main(String[] args) {
        int result=average(5, 7, 9);
        System.out.println(result);
    }
    static int average(int a, int b, int c){
        int avg=(a+b+c)/3;
        return avg;
    }
}
