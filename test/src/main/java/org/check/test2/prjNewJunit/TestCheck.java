package org.check.test2.prjNewJunit;

public class TestCheck {
	
	final static int x;
	
	static {
		x = 20;
		System.out.println("static block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(TestCheck.x);
		
//		doStuff(1);
//		doStuff(1,3);
		try {
			System.out.println("hi");
			show();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("chaught");
		}finally {
			System.out.println("finnally");
		}
		System.out.println("last");
	}
	
//	static void doStuff(int[] doArgs) {
//		
//	}
//	static void doStuff(int y,int ... doArgs) {
//		
//	}
	
	public static void show(){
		System.out.println("show");
		throw new RuntimeException();
	}
	
	void display(int i) {
		
	}

}
