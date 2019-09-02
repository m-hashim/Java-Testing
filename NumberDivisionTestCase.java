package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberDivisionTestCase {

	@Test
	public void test() {
		NumberDivision nd = new NumberDivision();
		String result = nd.divide(10, 2);
		assertEquals(result,"5.0");
		
		result = nd.divide(10, 0);
		assertEquals(result,"Cannot Divide by 0");
	}

}
