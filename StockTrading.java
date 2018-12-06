import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class StockTrading {

	public static void main(String[] args) {
	
		LinkedHashMap<Integer, Integer> stockPriceList = new LinkedHashMap<>();
		String buySell=null;
		Integer delta=null;
		
		stockPriceList.put(1, 120);
		stockPriceList.put(2, 115);
		stockPriceList.put(3, 119);
		stockPriceList.put(4, 113);
		stockPriceList.put(5, 117);
		stockPriceList.put(6, 115);
		stockPriceList.put(7, 112);
		stockPriceList.put(8, 117);
		stockPriceList.put(9, 120);
		stockPriceList.put(10, 115);
		stockPriceList.put(11, 119);
		stockPriceList.put(12, 113);
		stockPriceList.put(13, 117);
		stockPriceList.put(14, 115);
		stockPriceList.put(15, 112);
		stockPriceList.put(16, 117);
		stockPriceList.put(17, 120);
		Integer min = stockPriceList.get(1);
		Integer minIndex = 1;
		Iterator<Entry<Integer, Integer>> itr = stockPriceList.entrySet().iterator();
		//Integer min = stockPriceList.get(1);
		//itr.next();
		while(itr.hasNext())
		{
			Entry<Integer, Integer> item = itr.next();
			if(item.getValue()<=min)
			{
				min = item.getValue();
				minIndex = item.getKey();
			}
			else
			{
				if(delta!=null)
				{
					if((item.getValue()-min)>delta)
					{
						delta = item.getValue()-min;
						buySell = "Buy at: "+minIndex +" and sell at: "+item.getKey();
					}
				}
				else
				{
					delta = item.getValue()-min;
					buySell = "Buy at: "+minIndex +" and sell at: "+item.getKey();
				}
			}
		}
			System.out.println(buySell);
		}
		
		
	}

