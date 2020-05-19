package arrays;

import java.util.ArrayList;
import java.util.List;

public class GFGStockBuySell {

	public static void main(String[] args) {

		int arr[] = { 100, 180, 260, 310, 40, 535, 695 };
		int n = arr.length; 
		
		List<Integer> minimaList = new ArrayList<>();
		List<Integer> maximaList = new ArrayList<>();
		
		int count = 0;
		
		for (int i = 0; i < n; i++)
		{
			if (i == 0)
			{
				if (arr[i + 1] > arr[i])
					minimaList.add(arr[i]);
			}			
			else if (i == n - 1)
			{
				if (arr[i - 1] < arr[i])
					maximaList.add(arr[i]);
			}			
			else
			{
				if (arr[i + 1] > arr[i] && arr[i - 1] > arr[i])
					minimaList.add(arr[i]);
				else if (arr[i + 1] < arr[i] && arr[i - 1] < arr[i])
					maximaList.add(arr[i]);
			}			
		}
		
		if(minimaList.size() == 0)
			System.out.println("No transaction.");
		else 
		{
			for (int i = 0; i < minimaList.size(); i++)
			{
				System.out.println("Buy on : " + minimaList.get(i) + " Sell on : " + maximaList.get(i));
			}
		}
		
		
		

	}

}
