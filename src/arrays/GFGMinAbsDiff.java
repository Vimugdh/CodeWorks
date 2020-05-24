package arrays;

public class GFGMinAbsDiff {
	public static void main(String[] args) {

		int[] arr = {8, -8, 9, -9, 10, -11, 12};

		int n = arr.length, minAbsDiff = Integer.MAX_VALUE, absDiff = 0;

		for (int i = 0; i < n; i++)
		{
			if (i == n - 1)//circular array
				absDiff = Math.abs(arr[i] - arr[0]);
			else
				absDiff =  Math.abs(arr[i] - arr[i + 1]);
			if (absDiff < minAbsDiff)
				minAbsDiff = absDiff;
		}
		System.out.println(minAbsDiff);
	}
}
