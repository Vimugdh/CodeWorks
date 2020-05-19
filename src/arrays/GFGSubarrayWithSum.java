package arrays;

public class GFGSubarrayWithSum {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 5, 9, 1, 3};
		
		int k = 2, givenSum = 10, n = arr.length, currentSum = 0, start = 0, end = 0, found = 0;
		
		for (int i = 0; i < k; i++) {
			currentSum += arr[i];
		}		
		if (currentSum == givenSum)
		{
			found = 1;
			start = 0;
			end = k - 1;
		}			
		else
		{
			for (int i = k; i < n; i++)
			{
				currentSum += arr[i] - arr[i - k];
				if (currentSum == givenSum)
				{
					found = 1;
					start = i;
					end = i + k - 1;
				}
			}
		}		
		if (found == 1)
		{
			System.out.println("found at " + start + " " + end);
		}
		else
			System.out.println("not found");

	}

}
