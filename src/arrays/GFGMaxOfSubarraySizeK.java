package arrays;

public class GFGMaxOfSubarraySizeK {

	public static void main(String[] args) {

		int arr[] = {1, 8, 30, -5, 20, 7};

		int k = 3, n = arr.length, max = 0, currentSum = 0, start = 0, end = k - 1;

		for(int i = 0; i < k; i++)
			currentSum += arr[i];

		max = currentSum;

		for(int i = k; i < n; i++)
		{
			currentSum += arr[i] - arr[i - k];
			max = Math.max(max, currentSum);			
		}
		System.out.println(max);
	}
}
