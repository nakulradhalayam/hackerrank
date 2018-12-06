package com.hackerrank.algorithms;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
        String time = in.next();
        Integer newTime=0;
        
        
       if(time.substring(8).equals("PM"))
       {
    	  newTime=12+Integer.valueOf(time.substring(0, 2)) ;
    	  System.out.println(newTime.toString()+time.substring(2,8));
       }
       else
       {
    	   System.out.println(time.substring(0,8));
       }
      
	}

}
