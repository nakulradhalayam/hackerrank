package com.hackerrank.algorithms;

import java.util.Scanner;

public class StairCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        
        for(int i=0;i<n;i++)
        {
        	for(int j=0;j<n;j++)
        	{
        		if(j<(n-i-1))
        		{
        			System.out.print(" ");
        		}
        		else
        		{
        			System.out.print("#");
        		}
        	}
        	System.out.println();
        }
		
	}

}
