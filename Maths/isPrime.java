public class isPrime {
   public static void main(String[] args) {
	    System.out.println(IsPrime(16)); 
	}
	static boolean IsPrime(int n){
	    boolean IsPrime=true;
	    
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return IsPrime;
	}
}
