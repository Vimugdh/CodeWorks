package arrays;

import java.util.ArrayList;

public class GFGArrayReverseInGroups {

	public static void main(String[] args) {
		
		ArrayList<Integer> mv = new ArrayList<>();
		int arr[] = {1, 2, 3, 4, 5};
		for (int i = 0; i < arr.length; i++)
		{
			mv.add(arr[i]);
		}
		int n = mv.size(), k = 3;		
		reverse(mv, 0, k - 1);
		reverse(mv, k, n - 1);
		
		for(int i : mv)
			System.out.println(i);
	}

	private static void reverse(ArrayList<Integer> mv, int left, int right) {
		while (left < right)
        {
            mv.set(left, mv.get(left) + mv.get(right));
            mv.set(right, mv.get(left) - mv.get(right));
            mv.set(left, mv.get(left) - mv.get(right));
            left++;
            right--;
        }
		
		
	}

}
