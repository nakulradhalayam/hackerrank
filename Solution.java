package com.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	/*
	 * Complete the function below.
	 */

	    static int[] scores(int[] a) {
	        int n=a.length;
	        int jscore=0;
	        int sscore=0;
	        boolean jcheck=false;
	        boolean scheck=false;
	        int res[]= new int[2];
	        int i=0;
	        while(i<=n)
	          {
	            if(jcheck==false)
	                {
	            	if(i==(n-1))
	            	{
	            		jscore=jscore+a[i];
	            		break;
	            	}
	                if(a[i]>a[n-1])
	                    {
	                    jscore=jscore+a[i];
	                    i++;
	                }
	                else if(a[i]<a[n-1])
	                 {
	                    jscore=jscore+a[n-1];                    
	                    n=n-1;
	                }
	                jcheck=true;
	                scheck=false;
	            }
	            else if(scheck==false)
	                {
	            	if(i==(n-1))
	            	{
	            		sscore=sscore+a[i];
	            		break;
	            	}
	                if(a[i]>a[n-1])
	                    {
	                    sscore=sscore+a[i];
	                    i++;
	                }
	                else if(a[i]<a[n-1])
	                 {
	                    sscore=sscore+a[n-1];
	                    n=n-1;
	                }
	                jcheck=false;
	                scheck=true;
	            }
	        }
	     res[0]=jscore;
	        res[1]=sscore;
	        return res;
	    }
	    
	    public static void main(String[] args) throws IOException{
	     
	    	int _a[]=  new int [4];
	    	int res[]= new int[2];
	    	_a[0]=1;
	       _a[1]=7;
	       _a[2]=3;
	       _a[3]=2;
	        
	        res = scores(_a);
	      System.out.println(res[0]);
	      System.out.println(res[1]);
	    }
	}

