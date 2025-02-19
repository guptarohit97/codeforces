import java.util.Scanner;

public class CalculatingFunction {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
		long n = s.nextLong();
		long fn;
		
		// Calculate
		if (n%2 == 0) fn = n/2;
		else fn = (-1)*(n/2 + 1);
		
		// Output
		System.out.println(fn);
    }
    
}
