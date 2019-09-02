package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromeTestCase {

	@Test
	public void test() {
		Palindrome p = new Palindrome();
		boolean result = p.IsPalindrome("hannah");
		assertEquals(result,true);
		
		result = p.IsPalindrome("malayalam");
		assertEquals(result,true);
		
		result = p.IsPalindrome("No");
		assertEquals(result,false);
	}

}
