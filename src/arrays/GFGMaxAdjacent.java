package arrays;

public class GFGMaxAdjacent {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length, left = 0, right = 1;
		
		while (right < n)
		{
			System.out.println(Math.max(arr[left], arr[right]));
			left++;
			right++;
			
		}
	}

}
