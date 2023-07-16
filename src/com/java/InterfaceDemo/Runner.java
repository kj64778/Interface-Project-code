package com.java.InterfaceDemo;

public class Runner implements InterfaceDemo {

	public static void main(String[] args) {

		Runner run = new Runner();

		System.out.println("\n Object and instance as same Runner \n");
		run.sum();
		run.sub();
		run.div();
		run.mul();
		System.out.println("The value of A from Interface level A : "+a);
		
		System.out.println("\n Object create Interface Demo (Parent name) and Instance Call Runner(Child name \n)");
		InterfaceDemo inter = new Runner();
		inter.sum();
		inter.sub();
		inter.div();
		inter.mul();
		System.out.println("The value of A from Interface level A : "+ a);
		
//		we are not able to creat interface object due to interface default 100% abstract 
//		Runner obj = (Runner) new  InterfaceDemo();

	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		System.out.println("This is sum method from runner class");
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("This is sub method from runner class");
	}

	@Override
	public void div() {
		// TODO Auto-generated method stub
		System.out.println("This is div method from runner class");
	}

	@Override
	public void mul() {
		// TODO Auto-generated method stub
		System.out.println("This is mul method from runner class");
	}

}
