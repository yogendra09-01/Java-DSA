
public class primeInRange
{
	public static void main(String[] args) {
	    primeRange(16);
	    
	}
	static boolean isPrime(int n){
	    boolean isPrime=true;
	    
	    for(int i=2;i<=Math.sqrt(n);i++){
	        if(n%i==0){
	            return false;
	        }
	    }
	    return isPrime;
	}
	
	static void primeRange(int n){
	    for(int i=2;i<n;i++){
	        if(isPrime(i)){
	            System.out.println(i+" ");
	        }
	    }
	    System.out.println();
	}
}
