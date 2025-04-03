package org.juniit;

import org.junit.Assert;
import org.junit.Test;

public class A {
	
	@Test
	public void testA1() {
		System.out.println("Test A1");
	}
	@Test
	public void testA2() {
		System.out.println("Test A2");
		Assert.assertTrue("verify user",false);
	}
	@Test
	public void testA3() {
		System.out.println("Test A3");
	}
	@Test
	public void testA4() {
		System.out.println("Test A4");
	}
	

}
