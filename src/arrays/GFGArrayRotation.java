package arrays;

public class GFGArrayRotation {

	public static void main(String[] args) {
			int[] arr = new int[]{8, 1, 2, 2, 3};
			int n = arr.length;
			int d = 2;
			
			int[] rotatedArray = new int[n];
			
			for(int i = d; i < arr.length; i++)
			{
				rotatedArray[i - d] = arr[i];
			}

			for(int i = n - d; i < rotatedArray.length; i++)
			{
				rotatedArray[i] = arr[i - (n - d)];
			}	
						
			for(int element : rotatedArray)
				System.out.println(element);
		}
	}


