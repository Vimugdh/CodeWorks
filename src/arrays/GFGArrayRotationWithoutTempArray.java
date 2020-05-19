package arrays;

public class GFGArrayRotationWithoutTempArray {

	public static void main(String[] args) {
		int[] arr = new int[]{8, 1, 2, 2, 3};
		int n = arr.length;
		int d = 2;
		
		rotateArray(arr, d, n);
		for(int element : arr)
			System.out.println(element);
	}
	
	public static void rotateArray(int[] arr, int d, int n)
	{
		reverse(arr, 0, d - 1);
		reverse(arr, d, n - 1);
		reverse(arr, 0, n - 1);
	}
	
	public static void reverse(int[] arr, int start, int end)
	{
		while (start < end)
		{
			arr[start] += arr[end];
			arr[end] = arr[start] - arr[end];
			arr[start] -= arr[end];
			start++;
			end--;
		}
	}

}
