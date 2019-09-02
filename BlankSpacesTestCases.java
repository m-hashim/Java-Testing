package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlankSpacesTestCases {

	@Test
	public void test() {
		BlankSpaces bs = new BlankSpaces();
		int result = bs.CountBlankSpace("Hello Eclipse\t");
		assertEquals(9,result);
	}

}
