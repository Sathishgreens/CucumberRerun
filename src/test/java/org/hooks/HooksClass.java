package org.hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class HooksClass {
	
	@Before
	public void initialSetup() {
		System.out.println("@Before");
	}
	
	@After
	public void exit() {
		System.out.println("@After");
	}
	
	@BeforeStep
	public void tt() {
		System.out.println("@Before Step");
	}
	
	@AfterStep
	public void tc() {
		System.out.println("@After Step");
	}

}
