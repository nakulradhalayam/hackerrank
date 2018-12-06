package com.hackerrank.algorithms;

public class LambdaExp {

	static int x=0;
	private static void main(String[] args,int i) {
		int p=0;
		FINF inf = (int a,int b)->{System.out.println(a+b);x=x+1;System.out.println(p);
		return (a+b);};

		System.out.println("Sum is" + inf.calculate(2, 3));
		System.out.println(x);
		inf.doWork1();
		
		Integer i1=10;
		Integer k = new Integer(10);
		System.out.println("comparison "+(i1==k));
		
	}
	public static void main(String[] args) {
		int p=0;
		FINF inf = (int a,int b)->{System.out.println(a+b);x=x+1;System.out.println(p);
		return (a+b);};

		System.out.println("Sum is" + inf.calculate(2, 3));
		System.out.println(x);
		inf.doWork1();
		
		Integer i=10;
		Integer k = new Integer(10);
		System.out.println("comparison "+(i==k));
		
		
	}

}
