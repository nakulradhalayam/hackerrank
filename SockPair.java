import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;

public class SockPair {

	public static void main(String[] args) {
		

	}
	
	static int sockMerchant(int n, int[] ar) {
		HashMap<Integer,Integer> sockMap = new HashMap<>();
		int count=0;
		for(int i=0;i<ar.length;i++)
		{
			if(sockMap.containsKey(ar[i]))
			{
				count = sockMap.get(ar[i]);
				sockMap.put(ar[i], ++count);
			}
			else
			{
				sockMap.put(ar[i],1);
			}
		}
		int pairCount = 0;
		Iterator<Entry<Integer, Integer>> itr = sockMap.entrySet().iterator();
		Entry<Integer, Integer> item =null;
		while(itr.hasNext())
		{
			item = itr.next();
			pairCount=pairCount+(item.getValue()/2);
		}
		return pairCount;


    }

}
