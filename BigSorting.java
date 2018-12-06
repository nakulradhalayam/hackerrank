package com.hackerrank.algorithms;

import java.math.BigInteger;
import java.util.Scanner;

public class BigSorting {
	
static String[] bigSorting(String[] arr) {
	
	//BigInteger[] intAr = new BigInteger[];
        for(int i=0;i<arr.length;i++)
        {
        	BigInteger a = BigInteger.valueOf(Long.valueOf(arr[i]));
        	
        }
        	
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        String[] result = bigSorting(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");


        in.close();
    }

}
