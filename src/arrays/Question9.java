

package arrays;

public class Question9 {

	public static void main(String[] args) {
		
		int[] arr = new int[]{8, 1, 2, 2, 3}; //{1, 2, 3, 4, 0}
		int n = arr.length;
		
		int[] indexArr = new int[n];		
		for (int i = 0; i < n; i++)
		{
			indexArr[i] = i;
		}		
		quickSort(arr, indexArr, 0, n - 1);
		
		

	}

	public static void quickSort(int[] arr, int[] indexArr, int left, int right)
	{
		if (left >= right)
			return;
		
		int pivot = arr[(left + right) / 2];
		int index = partition(arr, indexArr, left, right, pivot);
		quickSort(arr, indexArr, left, index - 1);
		quickSort(arr, indexArr, index, right);
	}
	
	public static int partition(int[] arr, int[] indexArr, int left, int right, int pivot)
	{
		while (left <= right)
		{
			while (arr[left] < pivot)
				left++;
			while (arr[right] > pivot)
				right--;
			if (left <= right)
			{
				swap(arr, indexArr, left, right);
				left++;
				right--;
			}			
		}
		return left;
	}
	
	public static void swap(int[] arr, int[] indexArr, int left, int right)
	{
		int temp = arr[left];
		arr[left] = arr[right];
		arr[right] = temp;
		
		int temp2 = indexArr[left];
		indexArr[left] = indexArr[right];
		indexArr[right] = temp2;
	}
}
