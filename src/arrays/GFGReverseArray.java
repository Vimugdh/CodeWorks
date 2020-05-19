package arrays;

public class GFGReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[]{8, 1, 2, 2, 3};
		int n = arr.length;
		
		int low = 0, high = n - 1;
		while(low < high)
		{
			swap(arr, low, high);
			low++;
			high--;
		}
		
		for(int element : arr)
			System.out.println(element);
	}
	
	public static void swap(int[] arr, int low, int high)
	{
		arr[low] += arr[high];
		arr[high] = arr[low] - arr[high];
		arr[low] -= arr[high];
	}

}
