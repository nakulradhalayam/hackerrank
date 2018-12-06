package com.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class TravelToMoon {
	
	
    public static Node[] nodeList;
    public static List<Integer> countList;
	
	public static void main(String[] args) throws IOException {
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); 
		String[] temp = bfr.readLine().split(" "); 
		int N = Integer.parseInt(temp[0]); 
		int I = Integer.parseInt(temp[1]);
		//List<Node> nodeList= new ArrayList<>();
		nodeList= new Node[N];
		countList= new ArrayList<>();
		List<Integer> graphNodeCountList= new ArrayList<>();
		List<Integer> uniqueList= new ArrayList<>();
		for(int i = 0; i < I; i++)
	    {
	        temp = bfr.readLine().split(" ");
	        int a = Integer.parseInt(temp[0]);
	        int b = Integer.parseInt(temp[1]);
	        
	        //sObj.addEdge(a , b);
	        
	        if(uniqueList.contains(a))
	        {
	        	for(int j=0;j<N;j++)
	        	{
	        		if(j==a)
	        		{
	        			nodeList[j].getNeighbours().add(b);
	        			break;
	        		}
	        			
	        	}
	        }
	        else
	        {
	        	Node aA = new Node();
		        aA.setValue(a);
		        aA.setMarked(false);
		        aA.setCount(0);
		        List<Integer> neiList= new ArrayList<>();
		        neiList.add(b);
		        aA.setNeighbours(neiList);
		        nodeList[a]=aA;
		        uniqueList.add(a);
	        }
	        
	        if(uniqueList.contains(b))
	        {
	        	for(int j=0;j<N;j++)
	        	{
	        		if(j==b)
	        		{
	        			nodeList[j].getNeighbours().add(a);
	        			break;
	        		}
	        			
	        	}
	        }
	        
	        else
	        {
	        	Node bB = new Node();
		        bB.setValue(b);
		        bB.setMarked(false);
		        bB.setCount(0);
		        List<Integer> neiList= new ArrayList<>();
		        neiList.add(a);
		        bB.setNeighbours(neiList);
		        nodeList[b]=bB;
		        uniqueList.add(b);
	        }
	        
	        
	    }
		
		long combinations=0;
		
		for(int k=0;k<N;k++)
		{
			//List<Integer> checkList= new ArrayList<>();
			if(uniqueList.contains(k)&&!nodeList[k].isMarked())
			{
				
				neighbourCount(k);
				graphNodeCountList.add(countList.size());
				countList.clear();
				
			}
			
		}
		for(int i=0;i<graphNodeCountList.size();i++)
		{
			for(int j=i+1;j<graphNodeCountList.size();j++)
			{
				combinations=combinations+(graphNodeCountList.get(i)*graphNodeCountList.get(j));
			}
			combinations=combinations+((N-uniqueList.size())*graphNodeCountList.get(i));
		}
		for(Long i=(long) 1;i<(N-uniqueList.size());i++)
		{
			combinations=combinations+i;
		}
		System.out.println(combinations);
		
	}
	
	public static void neighbourCount(int val)
	{
		if(!nodeList[val].isMarked())
		{
			nodeList[val].setMarked(true);
			countList.add(val);
			for (Integer integer : nodeList[val].getNeighbours()) {
				neighbourCount(integer);
			}
		}
	}
	
	
 
	
}	
	
	class Node
	{
		boolean marked;
		Integer value;
		List<Integer> neighbours;
		int count;
	

		public boolean isMarked() {
			return marked;
		}

		public void setMarked(boolean marked) {
			this.marked = marked;
		}

		public Integer getValue() {
			return value;
		}

		public void setValue(Integer value) {
			this.value = value;
		}

		public List<Integer> getNeighbours() {
			return neighbours;
		}

		public void setNeighbours(List<Integer> neighbours) {
			this.neighbours = neighbours;
		}

		public int getCount() {
			return count;
		}

		public void setCount(int count) {
			this.count = count;
		}
		
	
		
	}
	



	
	
	


