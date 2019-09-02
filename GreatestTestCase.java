package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreatestTestCase {

	@Test
	public void testGreatest() {
		Greatest test = new Greatest();
		int result = test.GreatAmongTwo(5, 10);
		assertEquals(10,result);
	}

}
