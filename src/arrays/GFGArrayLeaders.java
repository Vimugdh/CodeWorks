//An element in an array is a leader if there are no greater elements on it's right side

package arrays;

public class GFGArrayLeaders {

	public static void main(String[] args) {
		
		int[] arr = new int[]{5, 3, 20, 15, 8, 25, 3};
		int n = arr.length;
		
		int maxFromRight = arr[n - 1];
		
		System.out.println(maxFromRight);
		
		for (int i = n - 2; i >= 0; i--)
		{
			if (arr[i] > maxFromRight)
			{
				maxFromRight = arr[i];
				System.out.println(arr[i]);
			}				
		}
	}
}
