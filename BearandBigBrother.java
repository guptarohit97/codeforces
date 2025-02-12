import java.util.Scanner;

public class BearandBigBrother {
    static Scanner sc = new Scanner(System.in);
    public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		
		int m=sc.nextInt();
        int n=sc.nextInt();
        int cnt=0;
        while(m<=n)
        {
            m=m*3;
            n=n*2;
            cnt++;
        }
        System.out.println(cnt);
	}

    
}
