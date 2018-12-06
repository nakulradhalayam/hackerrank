package com.hackerrank.algorithms;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class BitSort {
	
static int[] rearrange(int[] elements) {
	

	int aux []= new int[elements.length];
	
    for (int i=0; i<elements.length; i++){
        aux[i] = countBits(elements[i]);
        
    }
    Arrays.sort(aux);
    return aux;
    //HashMap<String, String> m= new HashMap<>();
    //m.containsKey(m);
    }

    private static int countBits(int a) {
    	int count = 0;
        while (a!=0)
        {
           String b= Integer.toBinaryString(a);
        	if (b.charAt(b.length()-1)=='1')
                count+= 1;
            a = a>>1;
     System.out.println(a);
        }
        return count;
}

	/**
     * DO NOT MODIFY THIS METHOD!
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        
        int n = 0;
        n = Integer.parseInt(in.nextLine().trim());
        int[] elements = new int[n];
        int element;
        for (int i = 0; i < n; i++) {
            element = Integer.parseInt(in.nextLine().trim());
            elements[i] = element;
        }
        
        // call rearrange function
        int[] results = rearrange(elements);
        
        for (int i = 0; i < results.length; i++) {
            System.out.println(String.valueOf(results[i]));
        }
    }

}
