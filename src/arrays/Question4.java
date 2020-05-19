//In a given array, for all elements find the number of elements which are greater than that element and present on right side of that element. 
package arrays;

public class Question4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[]{10, 7,8,3,5,9,11,6,4};
		int[] arr1 = new int[arr.length];
		
		int n = arr.length;
		
		for (int i = 0; i < n; i++)
		{
			int largerCount = 0;
			for (int j = i + 1; j < n; j++)
			{
				if (arr[j] > arr[i])
					largerCount++;
			}
			arr1[i] = largerCount;
		}
		
		for (int item : arr1)
			System.out.println(item);
	}

}
