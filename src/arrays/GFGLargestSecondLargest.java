package arrays;

public class GFGLargestSecondLargest {

	public static void main(String[] args) {
		
		int arr[] = {1, 2, 3, 4, 5};
		int n = arr.length;
		int max = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        for (int i = 0; i < n; i++)
        {
            if (arr[i] > max) 
                max = arr[i];
        }
        for (int i = 0; i < n; i++)
        {
            if (arr[i] != max && arr[i] > max2) 
                max2 = arr[i];
        }
        if (max2 == Integer.MIN_VALUE)
            max2 = -1;
        
        System.out.println(max + " " + max2);

	}

}
