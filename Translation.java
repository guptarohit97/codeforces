import java.util.Scanner;

public class Translation
{
	static Scanner reader = new Scanner(System.in);
	public static void main(String[] args) {
		
		String n = reader.next();
		String p = reader.next();
		String rev = "";
		for(int i=n.length()-1; i>=0; i--){
		    rev += n.charAt(i);
		}
		if(p.equals(rev))
		    System.out.println("YES");
		else
		    System.out.println("NO");
	}
}