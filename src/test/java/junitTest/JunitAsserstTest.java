package junitTest;

import static org.junit.Assert.*;

import org.junit.Test;

public class JunitAsserstTest {

	@Test
	public void twoPlustwoEqual4() {
		assertEquals(4,2+2);
	}
	
	@Test
	public void twoPlustwoEqualFour() {
		assertEquals("2 + 2 =4 ",4,2+2);
					// add descripton first
	}
	
	boolean result = true;
	
	@Test
	public void testingAssertTrue() {
		assertTrue(result);
	}
	
	@Test
	public void testingAssertTrueWithDescription() {
		assertTrue("Result is true",!result);
	}
}
