package org.juniit;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestResultt {
	
	@Test
	public void result() {
		Result r = JUnitCore.runClasses(A.class,B.class,C.class,Sample.class);
		System.out.println("get run count"+r.getRunCount());
		System.out.println("get ignore"+r.getIgnoreCount());
		System.out.println("get runtime"+r.getRunTime());
		System.out.println("get failure"+r.getFailureCount());
		
		List<Failure> f = r.getFailures();
		for(Failure x:f) {
			System.out.println(x);
			System.out.println(x.getMessage());
			System.out.println(x.getTestHeader());
			System.out.println(x.getException());
			
		
		

	}

	}
	}
