//Given a list of integers, find the smallest consecutive set of integers that sums up to a given number k

package arrays;

public class Question2 {

	public static void main(String[] args) {
		int[] arr = new int[] {1, 2, 2, 5, 9, 1, 3};

		int k = 10, n = arr.length, sum = 0, smallestSetLength = n, lowerBound = 0, upperBound = 0, finalLowerBound = 0, finalUpperBound = 0;

		int i = 0;
		while(i < n)
		{
			if (sum == k)
			{
				int subArrayLength = upperBound - lowerBound;
				if (subArrayLength < smallestSetLength)
				{
					smallestSetLength = subArrayLength + 1;
					finalLowerBound = lowerBound; 
					finalUpperBound = upperBound;
				}
			}
			if (sum >= k)
			{
				sum -= arr[lowerBound];
				lowerBound++;				
			}
			if (sum < k)
			{
				sum += arr[i];
				upperBound++;
				i++;				
			}			
		}
		for (i = finalLowerBound; i < finalUpperBound; i++)
		{
			System.out.println(arr[i]);
		}


		/*for (int i = 0; i < n; i++)
		{

			for (int j = i; j < n; j++)
			{
				sum += arr[j];
				if (sum == k && ((j - i) < smallestSetLength))
				{
					smallestSetLength = j-i;
					lowerBound = i;
					upperBound = j;
					sum = 0;
				}
				else if (sum > k)
					break;
			}
			sum = 0;
		}
		for (int i = lowerBound; i <= upperBound; i++)
		{
			System.out.println(arr[i]);
		}*/

	}
}

