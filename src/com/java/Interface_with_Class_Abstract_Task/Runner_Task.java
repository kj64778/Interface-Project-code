package com.java.Interface_with_Class_Abstract_Task;


public class Runner_Task extends AbstractClass_task implements  Interface_Task {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("\n Object create of Interface and instance of Runner \n");

		Interface_Task obj = new Runner_Task();
		System.out.println("The value of a variable from interface : " + Interface_Task.a);
		obj.sum(10, 20);
		obj.sub(100, 20);
		

		Interface_Task.mul(30, 30);

		System.out.println("Interface Obect are not accessable to Mul and div method which is stored in AbstractClass");
//		not able to access Mul method not in interfaces class 

//		obj.mu();
//		obj.div();

		System.out.println("\n Object create of AbstractClass and instance of Runner \n");

		AbstractClass_task abs = new Runner_Task();
		System.out.println("The value of a variable from interface : " + Interface_Task.a);
		System.out.println("The value of a variable from AbstractClass nonstatic A : " + abs.a);

		abs.sum(20, 20);
		abs.sub(40, 20);
		abs.mul(10.5f, 10.5f);
		abs.div(80.00, 20.00);
		
		System.out.println("\n Object create of Runner and instance also Runner \n");
		
		Runner_Task run = new Runner_Task();
//		System.out.println("The value of A call as Object run : " +run.a);

		run.sum(20, 20);
		run.sub(40, 20);
		run.mul(10.5f, 10.5f);
		run.div(80.00, 20.00);

	}

	@Override
	public void sum(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The sum value A+B :" + (a + b));
	}

	@Override
	public void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("The sum value A-B :" + (a - b));
	}

	@Override
	public void mul(float a, float b) {
		// TODO Auto-generated method stub
		System.out.println("The sum value A*B :" + (a * b));
	}

	@Override
	public void div(double a, double b) {
		// TODO Auto-generated method stub
		System.out.println("The sum value A/B :" + (a / b));
	}

}


