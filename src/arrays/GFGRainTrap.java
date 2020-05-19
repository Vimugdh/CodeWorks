package arrays;

public class GFGRainTrap {

	public static void main(String[] args) {
		
		int[] arr = new int[]{3, 0, 1, 2, 5};
		int n = arr.length;
		
		System.out.println("Max storable volume is: " + findWater(arr, n));
	}

	private static int findWater(int[] arr, int n) {
			int totalWater = 0;
			
			//stores max value till left of index including itself
			int[] left = new int[n];
			
			//stores max value till right of index including itself
			int[] right = new int[n];
			
			left[0] = arr[0];
			for (int i = 1; i < n; i++)
				left[i] = Math.max(left[i - 1], arr[i]);
			
			right[n - 1] = arr[n - 1];
			for (int i = n - 2; i >= 0; i--)
				right[i] = Math.max(right[i + 1], arr[i]);
			
			for (int i = 0; i < n; i++)
			{
				totalWater += Math.min(left[i], right[i]) - arr[i];
			}
			
			return totalWater;
	}	
}