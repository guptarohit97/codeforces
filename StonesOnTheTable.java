import java.util.*;

public class StonesOnTheTable
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();

		// Counters
		int counter = 0;
		

		for (int i = 1; i < n; i++) {
			if (s.charAt(i) == s.charAt(i-1)) 
				counter++;
			
		}

		// Output
		System.out.println(counter);
	}	
}