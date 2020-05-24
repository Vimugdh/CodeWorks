package arrays;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		ArrayList<Integer> leaders = new ArrayList<>();
		int arr[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++)
		{
			leaders.add(arr[i]);
		}
		
		int leaderSize = leaders.size();
        int left = 0, right = leaderSize - 1;
        while (left < right)
        {
            leaders.set(left, leaders.get(left) + leaders.get(right));
            leaders.set(right, leaders.get(left) - leaders.get(right));
            leaders.set(left, leaders.get(left) - leaders.get(right));
            left++;
            right++;
        }
        
        for (int element : leaders)
        	System.out.println(element);

	}

}
