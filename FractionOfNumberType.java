package com.hackerrank.algorithms;

import java.util.Scanner;

public class FractionOfNumberType {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        Double countP=0.0d;
        Double countN=0.0d;
        Double countZ=0.0d;
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
            if(arr[arr_i]==0)
            {
            	countZ=countZ+1.0;
            }
            else if(arr[arr_i]<0)
            {
            	countN=countN+1.0;
            }
            else if(arr[arr_i]>0)
            {
            	countP=countP+1.0;
            }
        }
        
        System.out.println(String.format("%.6f", countP/n));
        System.out.println(String.format("%.6f", countN/n));
        System.out.println(String.format("%.6f", countZ/n));
    }
	
}
