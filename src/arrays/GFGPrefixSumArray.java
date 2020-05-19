package arrays;

public class GFGPrefixSumArray {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 2, 5, 9, 1, 3};
		
		int n = arr.length;
		
		int[] prefixSumArray = new int[n];
		prefixSumArray[0] = arr[0];
		
		for (int i = 1; i < n; i++)
		{
			prefixSumArray[i] = prefixSumArray[i-1] + arr[i];
		}
		
		for (int element : prefixSumArray)
		{
			System.out.println(element);
		}
	}

}
