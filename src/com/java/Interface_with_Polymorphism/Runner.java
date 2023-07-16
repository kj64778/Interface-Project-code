package com.java.Interface_with_Polymorphism;

public class Runner implements InterFace2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("\n Object Create of runner and instance also runner\n");
		Runner run = new Runner();
		
		run.sum();
		run.sum(10, 20);
		run.sum(10, 10.5f);
		run.sum(10.5f, 10);
		run.sum(10.5f, 10, 10);
	run.sum(10.5, 20, 30.5f, 40l, (short) 00, false);
	
	

		
	}

	@Override
	public void sum() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int sum(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(int a, float b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(float b, int a) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(float a, int b, int c) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int sum(double a, int b, float c, long d, short f, boolean h) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
