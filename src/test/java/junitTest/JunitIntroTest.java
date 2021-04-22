package junitTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class JunitIntroTest {

	@Test
	public void learningTestAnnotation() {
		System.out.println("test1");
	}
	
	@Test
	public void learningTestAnnotation2() {
		System.out.println("test2");
	}
	
	@Test
	public void learningTestAnnotation3() {
		System.out.println("test3");
	}
	
	@Before
	public void beforeAnnotation() {
		System.out.println("Create Connection!!");
	}
	
	@After
	public void afterAnnotation() {
		System.out.println("close Connection!!");
	}
	
	@BeforeClass
	public static void testBeforeClass() {
		System.out.println("---------------");
		System.out.println("before Class");
		System.out.println("---------------");
	} 
	
	@AfterClass
	public static void testAfterClass() {
		System.out.println("---------------");
		System.out.println("After Class");
		System.out.println("---------------");
	} 
	
	
	
	
	
	
}
