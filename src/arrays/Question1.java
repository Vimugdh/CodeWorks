//Find largest number with least frequency [requirement < O(n^2)]

package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Question1 {

	public static void main(String[] args) {
		int[] arr = new int[] {2, 2, 5, 50, 1};

		//Arrays.sort(arr);

		Map<Integer, Integer> arrayMap = new HashMap<Integer, Integer>();
		int n = arr.length, result = -1, minCount = n + 1, currentCount = 1;

		for (int i = 0; i < n; i++)
		{
			if(arrayMap.containsKey(arr[i]))
				arrayMap.put(arr[i], arrayMap.get(arr[i]) + 1);
			else
				arrayMap.put(arr[i], 1);
		}

		for (Entry<Integer, Integer> miniArrayMap : arrayMap.entrySet())
		{
			int key = miniArrayMap.getKey();			
			int value = miniArrayMap.getValue();

			if (key > result && value <= minCount)
			{
				result = key;
				minCount = value;
			}

		}
		
		/*for (int i = n-1; i > 0; i--) 
		{ 
			if (arr[i] == arr[i - 1]) 
				currentCount++;
			else 
			{ 
				if (currentCount < minCount) 
				{ 
					minCount = currentCount; 
					result = arr[i]; 
				} 
				currentCount = 1; 
			}
		}
		*/

		System.out.println(result);

	}

}
