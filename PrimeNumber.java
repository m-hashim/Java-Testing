package Test;

public class PrimeNumber {

	public boolean IsPrime(int number) {
		if(number==1) return false;
		
		else if(number==2) return true;
		
		int NumRoot= (int) Math.ceil(Math.sqrt(number));
		for(int i=2;i<=NumRoot;i++) {
			if(number%i==0) return false;
		}
		return true;
	}
	public static void main(String args[]) {
		PrimeNumber p = new PrimeNumber() ;
		System.out.println(p.IsPrime(6));
	}
}
