package Test;

public class NumberDivision {
	String divide(float a, float b){
		String result;
		if (b == 0)
			result = "Cannot Divide by 0";
		else
			result = (a/b)+"";
		
		return result;
	}

	public static void main(String args[]) {
		NumberDivision nd = new NumberDivision();
		System.out.println(nd.divide(50,50));
		System.out.println(nd.divide(50,0));
		
	}
}
