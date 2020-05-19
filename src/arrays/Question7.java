

package arrays;

public class Question7 {

	public static void main(String[] args) {
		
		String validString = "*))(";
		char[] validStringArr = validString.toCharArray();		
		int leftParen = 0, rightParen = 0, star = 0, isValid = 1, n = validStringArr.length;
		
		for (int i = 0; i < n; i++)
		{
			if (validStringArr[i] == '*')
				star++;				
			else if (validStringArr[i] == '(')
				leftParen++;
			else if (validStringArr[i] == ')')
			{
				if (leftParen <= rightParen)
				{
					if (star > 0)
					{
						leftParen++;
						star--;
						rightParen++;
					}
					else
						isValid = 0;
				}
				else
					rightParen++;
			}
		}
		
		if (leftParen != rightParen)
		{
			int difference = rightParen - leftParen;
			if (difference > star)
				isValid = 0;
		}
		
		if (isValid == 1)
			System.out.println("True");
		else
			System.out.println("False");
	}
}
