package com.hackerrank.algorithms;

public class APGP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] res = new int [6];
		res[0]=1;
		res[1]=2;
		res[2]=3;
		res[3]=4;
		res[4]=5;
		res[5]=6;
		
		findSeries(res);
		
	}
	
	 static void findSeries(int[] a) {

      int n=a.length;
      int i=0;
      int j=0;
      int k=0;
     while(i<n)
      {
    	 j=i+1; 
    	 while(j<n)
    	  {
    		  k=j+1;
    		  while(k<n)
    		  {
    			  if((2*a[j])==(a[i]+a[k]))
    			  {
                    if(!((a[j]*a[j]==(a[i]*a[k]))))
    				  System.out.println(a[i] +"," +a[j]+ "," + a[k]);
    			  }
    			  k++;
    		  }
    		  j++;
    	  }
    	  i++;
      }
     
     i=0;
     j=0;
     k=0;
     while(i<n)
     {
   	 j=i+1; 
   	 while(j<n)
   	  {
   		  k=j+1;
   		  while(k<n)
   		  {
   			 
                   if((((a[j]*a[j])==(a[i]*a[k]))&&(a[k]%a[i]==0)&&(a[j]%a[i]==0)))
   				  System.out.println(a[i] +"," +a[j]+ "," + a[k]);
   			  
   			  k++;
   		  }
   		  j++;
   	  }
   	  i++;
     }
	    }

}
