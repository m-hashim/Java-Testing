package Test;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentDivisionTestCase {

	@Test
	public void test() {
		StudentDivision sd = new StudentDivision();
		String result = sd.Division(100, 100, 100);
		assertEquals("First Division",result);
		
		result = sd.Division(60, 60, 60);
		assertEquals("First Division",result);
		
		result = sd.Division(0, 0, 0);
		assertEquals("Fails",result);
		
	}

}
