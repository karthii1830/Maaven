package org.juniit;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class B {
	
	@Test
	public void testB1() {
		System.out.println("Test B1");
		Assert.assertTrue("verify pass",false);
	}
	@Ignore
	@Test
	public void testB2() {
		System.out.println("Test B2");
	}
	@Test
	public void testB3() {
		System.out.println("Test B3");
	}

}
