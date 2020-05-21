package arrays;

public class GFGMajorityWins {

	public static void main(String[] args) {
		int[] arr = {5, 22, 29, 12, 32, 69, 1, 75};
		
		int n = arr.length, x = 29, y = 69, countX = 0, countY = 0;
		
		for (int i = 0; i < n; i++)
		{
			if (arr[i] == x) countX++;
			else if (arr[i] == y) countY++;
		}
		
		if (countX > countY) System.out.println(x);
		else if (countY > countX) System.out.println(y);
		else System.out.println(Math.min(x, y));
	}

}
