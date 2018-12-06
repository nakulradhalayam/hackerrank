package com.hackerrank.algorithms;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class RailwayTrack {

	static Set<Long> trackCell = new HashSet<>();
	
	 static long gridlandMetro(Long n, Long m, Long k, Long[][] track) {
		 
		 //Long[][] arr = new Long[n][m];
		// Set<Longeger> trackCell = new HashSet<>();
		 for(Long i=0;i<k;i++)
		 {
			 addToMap(track[i][0],track[i][1],track[i][2],m);
		 }
			 
		 return ((m*n)-trackCell.size());
		 
	    }

	    private static void addToMap(Long i, Long j, Long k, Long m) {
	    	{
	    		if(j<=k)
	    		{
	    			for(Long p=j;p<=k;p++)
	    			{
	    				trackCell.add(((i-1)*m)+p);
	    			}
	    		}
	    		else
	    		{
	    			for(Long p=j;p>=k;p--)
	    			{
	    				trackCell.add(((i-1)*m)+p);
	    			}
	    		}
	    		
	    	}
		
	}

		public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        Long n = in.nextLong();
	        Long m = in.nextLong();
	        int k = (int) in.nextLong();
	        Long[][] track = new Long[k][3];
	        for(int track_i = 0; track_i < k; track_i++){
	            for(int track_j = 0; track_j < 3; track_j++){
	                track[track_i][track_j] = in.nextLong();
	            }
	        }
	        long result = gridlandMetro(n, m, k, track);
	        System.out.println(result);
	        in.close();
	    }
}
