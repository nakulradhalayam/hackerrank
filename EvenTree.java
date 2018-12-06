package com.hackerrank.algorithms;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class EvenTree {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in)); 
		String[] temp = bfr.readLine().split(" "); 
		int N = Integer.parseInt(temp[0]); 
		int I = Integer.parseInt(temp[1]);
		List<Integer> uniqueList = new ArrayList<>();
		List<Node> nodeList= new ArrayList<>();
		
		for(int i=0;i<I;i++)
		{
			 temp = bfr.readLine().split(" ");
		        int a = Integer.parseInt(temp[0]);
		        int b = Integer.parseInt(temp[1]);
		        
		        if(uniqueList.contains(a))
		        {
		        	for(int j=1;j<N;j++)
		        	{
		        		if(j==a)
		        		{
		        			nodeList.get(j).getNeighbours().add(b);
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
			        nodeList.add(a, aA);
			        uniqueList.add(a);
		        }
		        
		        if(uniqueList.contains(b))
		        {
		        	for(int j=0;j<N;j++)
		        	{
		        		if(j==b)
		        		{
//		        			nodeList[j].getNeighbours().add(a);
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
//			        nodeList[b]=bB;
			        uniqueList.add(b);
		        }
		        
		}

	}

}

class GraphNode
{
	Integer value;
	Integer childCount;
	List<GraphNode> neighbours;
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Integer getChildCount() {
		return childCount;
	}
	public void setChildCount(Integer childCount) {
		this.childCount = childCount;
	}
	public List<GraphNode> getNeighbours() {
		return neighbours;
	}
	public void setNeighbours(List<GraphNode> neighbours) {
		this.neighbours = neighbours;
	}
	
	
		
	
}
