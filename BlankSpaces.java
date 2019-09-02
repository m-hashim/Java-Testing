package Test;

public class BlankSpaces {

	public int CountBlankSpace(String str) {
		int result = 0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==' ') {
				result++;
			}else if(str.charAt(i)=='\t') {
				result+=8;
			}
			else if(str.charAt(i)=='\n') {
				result+=30;
			}
		}
		return result;
	}
	
	public static void main(String args[]) {
		BlankSpaces bs = new BlankSpaces() ;
		System.out.println(bs.CountBlankSpace("Hello Eclipse      "));
		
	}
}
