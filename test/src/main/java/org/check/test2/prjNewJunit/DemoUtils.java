package org.check.test2.prjNewJunit;

public class DemoUtils {
	
	public int add(int a ,int b) {
		return a + b;
	}
	
	public String throwsExp(int a) throws Exception {
		if (a < 0) {
			throw new Exception();
		}
		return "greater than 0";
	}
	
	public void checkTimeout() throws InterruptedException {
		System.out.println("Timeout method");
		Thread.sleep(2000);
	}

}
