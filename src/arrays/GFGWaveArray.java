package arrays;

public class GFGWaveArray {

	public static void main(String[] args) {
		
		int[] arr = new int[]{1, 2, 3, 4, 5};
		
		int n = arr.length;
		
		if (n % 2 == 0)
		{
			for(int i = 0; i < n; i += 2)
			{
				arr[i] += arr[i + 1];
				arr[i + 1] = arr[i] - arr[i + 1];
				arr[i] -= arr[i + 1];
			}
		}
		else
		{
			for(int i = 0; i < n - 1; i += 2)
			{
				arr[i] += arr[i + 1];
				arr[i + 1] = arr[i] - arr[i + 1];
				arr[i] -= arr[i + 1];
			}
		}
		
		

		for(int element : arr)
			System.out.println(element);
		
	}

}
