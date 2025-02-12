import java.util.Scanner;

public class WrongSubtraction {
    static Scanner s=new Scanner(System.in);
    public static void main(String[] args) {
        int n=s.nextInt();
        int t=s.nextInt();

        while(t>0)
        {
            if(n%10==0)
            {
                n/=10;
            }
            else{
                n-=1;
            }
            t--;
        }
        System.out.println(n);
    }
    
}
