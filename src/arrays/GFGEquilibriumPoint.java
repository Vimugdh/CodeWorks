package arrays;

public class GFGEquilibriumPoint {

	public static void main(String[] args) {
		
		int[] arr = {3, 4, 8, -9, 20, 6};
		
		int n = arr.length, totalSum = 0, sum = 0;
		
		for (int i = 0; i < n; i++)
			totalSum += arr[i];

		for (int i = 0; i < n; i++)
		{
			if (sum == totalSum - arr[i])
				System.out.println("Found " + arr[i]);
			sum += arr[i];
			totalSum -= arr[i];
		}

	}

}
