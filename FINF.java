package com.hackerrank.algorithms;

import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface FINF {

	public int calculate(int a, int b);
	
	default public void doWork()
	{
		System.out.println("hi");
	}
	default public void doWork1()
	{
		System.out.println("hi");
		List<Integer> lis = new ArrayList<>();
		lis.add(12);
		lis.add(12);
		lis.add(13);
		lis.forEach(name->{System.out.println("abc".equals(name));});
		System.out.println("abc".equals(12));
	}
	default public void doWork2()
	{
		System.out.println("hi");
	}
	default public void doWork3()
	{
		System.out.println("hi");
	}
}
