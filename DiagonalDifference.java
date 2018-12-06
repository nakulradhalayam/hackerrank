package com.hackerrank.algorithms;

import java.util.Scanner;

public class DiagonalDifference {

	
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int d1=0;
	        int d2=0;
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	                if(a_i==a_j)
	                {
	                	d1=d1+a[a_i][a_j];
	                }
	                if((n-1)==(a_i+a_j))
	                {
	                	d2=d2+a[a_i][a_j];
	                }
	            }
	        }
	        System.out.println(Math.abs(d1-d2));
	    }
}
