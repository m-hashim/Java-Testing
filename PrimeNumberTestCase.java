package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class PrimeNumberTestCase {

	@Test
	public void test() {
		PrimeNumber p = new PrimeNumber();
		boolean result = p.IsPrime(12);
		assertEquals(result, false);
		
		result = p.IsPrime(17);
		assertEquals(result, true);
	}

}
