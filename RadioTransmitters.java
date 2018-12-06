package com.hackerrank.algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class RadioTransmitters {
	
	
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i = 0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        Arrays.sort(x);
        int result = hackerlandRadioTransmitters(x, k);
        System.out.println(result);
        in.close();
    }
	
	 static int hackerlandRadioTransmitters(int[] x, int k) {
         int count=0;
		 int index=0;
		 //int bigIndex=0;
		 while(index < x.length)			 
		 {
			 index=makeTheSet(index,x,k);
			 count++;
		 }

		 return count;
	    }
	 static int makeTheSet(int index, int[] x, int k)
	 {
		 int bigIndex=index;
		 int pIndex=0;
		 int begIndex=0;
		 while((index < x.length))
		 {
			 if((x[index]-x[bigIndex])<=k)
			 {
				 index++;
			 }
			 else
			 {
				 break;
			 }
		 }
		 pIndex= index-1;
		 begIndex=pIndex;
		 while((pIndex < x.length))
		 {
			 if((x[pIndex]-x[begIndex])<=k)
			 {
				 pIndex++;
			 }
			 else
			 {
				 break;
			 }
		 }
		 return pIndex;
	 }

}
