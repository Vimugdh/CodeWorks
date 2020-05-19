//Given a binary array, find the maximum length of a contiguous subarray with equal number of 0 and 1.
package arrays;

public class Question5 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{0, 1, 0};
		
		int n = arr.length;
		
		for(int i = 0; i < n; i++)
		{
			for (int j = i; j < n; j++)
			{
				System.out.print(arr[j] + " ");
			}
			System.out.println();
		}

	}

}
