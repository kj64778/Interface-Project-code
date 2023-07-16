package com.java.Interface_with_Class_Abstract;

public interface Interface {
	
	public int a=10;
	
	public void sum(int a, int b);
	
	public void sub(int a, int b);
	
//	public final void div(int a, int b);
	
	public  static void mul(int a, int b) {
		System.out.println("The method definds only java 1.8 and above");
		System.out.println("The vale of mul A*B from interface :"+(a*b));
	}
	
	
	
	

}
