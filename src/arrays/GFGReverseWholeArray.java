package arrays;

public class GFGReverseWholeArray {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		
		int sizeOfArray = arr.length, left = 0, right = sizeOfArray - 1;
        while (left < right)
        {
            arr[left] += arr[right];
            arr[right] = arr[left] - arr[right];
            arr[left] -= arr[right];
            left++;
            right--;
        }
        
        for(int element : arr)
        	System.out.println(element);

	}

}
